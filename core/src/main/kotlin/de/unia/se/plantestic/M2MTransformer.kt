package de.unia.se.plantestic

import com.google.common.io.Resources
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.m2m.qvt.oml.BasicModelExtent
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl
import org.eclipse.m2m.qvt.oml.TransformationExecutor
import org.eclipse.m2m.qvt.oml.util.WriterLog
import plantuml.puml.UmlDiagram
import java.io.OutputStreamWriter

object M2MTransformer {

    private val QVT_PUML2REQRES_TRANSFORMATION_URI =
        URI.createURI(Resources.getResource("qvt/puml2reqres.qvto").toExternalForm())

    private val QVT_REQRES2RESTASSURED_TRANSFORMATION_URI =
        URI.createURI(Resources.getResource("qvt/reqres2restassured.qvto").toExternalForm())

	private val QVT_REQRES2REQRES_TRANSFORMATION_URI =
        URI.createURI(Resources.getResource("qvt/reqres2reqres.qvto").toExternalForm())

    private val QVT_MERGERAOPENAPI_TRANSFORMATION_URI =
        URI.createURI(Resources.getResource("qvt/mergeRestassuredOpenAPI.qvto").toExternalForm())

    /**
     * Transforms a UmlDiagram EObject to a Request Response Pair EObject.
     * @param inputModel The UmlDiagram to transform
     * @return Request Response Pair
     */
    fun transformPuml2ReqRes(inputModel: EObject): EObject {
        require(inputModel is UmlDiagram) { "Puml transformation input wasn't a puml object!" }
        return doQvtoTransformation(inputModel, QVT_PUML2REQRES_TRANSFORMATION_URI)
    }

	fun transformReqRes2ReqRes(inputModel: EObject, configList: EObject): EObject {
        return mergeQVTModels(inputModel, configList, QVT_REQRES2REQRES_TRANSFORMATION_URI)
    }

    /**
     * Transforms a Request Response Pair EObject to a Rest Assured EObject.
     * @param inputModel The Request Response Pair EObject to transform
     * @returnRest Assured EObject
     */
    fun transformReqRes2RestAssured(inputModel: EObject): EObject {
        return doQvtoTransformation(inputModel, QVT_REQRES2RESTASSURED_TRANSFORMATION_URI)
    }

    fun mergeRestAssuredOpenApi(inputModel: EObject, apiModel: EObject) : EObject {
        return mergeQVTModels(inputModel, apiModel, QVT_MERGERAOPENAPI_TRANSFORMATION_URI);
    }

    private fun doQvtoTransformation(inputModel: EObject, transformationUri: URI): EObject {
        // Sources:
        // - https://github.com/mrcalvin/qvto-cli/blob/master/qvto-app/src/main/java/at/ac/wu/nm/qvto/App.java
        // - https://wiki.eclipse.org/QVTOML/Examples/InvokeInJava

        val executor = TransformationExecutor(transformationUri)
        val validationDiagnostic = executor.loadTransformation()
        require(validationDiagnostic.message == "OK") {
            validationDiagnostic.children.fold(StringBuilder("\n"), { sb, child -> sb.appendln(child) })
        }

        val input = BasicModelExtent(listOf(inputModel))
        val output = BasicModelExtent()

        val context = ExecutionContextImpl()
        context.setConfigProperty("keepModeling", true)
        context.setConfigProperty("diagramName", EcoreUtil.getURI(inputModel).trimFileExtension().lastSegment())

        require(System.out != null) { "System.out was null!" }
        val outStream = OutputStreamWriter(System.out!!)
        val log = WriterLog(outStream)
        context.log = log

        val result = executor.execute(context, input, output)

        if (result.severity == Diagnostic.OK) {
            require(!output.contents.isNullOrEmpty()) { "No transformation result!" }
            return output.contents[0]
        } else {
            throw IllegalArgumentException(result.toString())
        }
    }

	private fun mergeQVTModels(inputModel1: EObject, inputModel2: EObject, transformationUri: URI): EObject {
        // Sources:
        // - https://github.com/mrcalvin/qvto-cli/blob/master/qvto-app/src/main/java/at/ac/wu/nm/qvto/App.java
        // - https://wiki.eclipse.org/QVTOML/Examples/InvokeInJava

        val executor = TransformationExecutor(transformationUri)
        val validationDiagnostic = executor.loadTransformation()
        require(validationDiagnostic.message == "OK") {
            validationDiagnostic.children.fold(StringBuilder("\n"), { sb, child -> sb.appendln(child) })
        }

        val input1 = BasicModelExtent(listOf(inputModel1))
		val input2 = BasicModelExtent(listOf(inputModel2))
        val output = BasicModelExtent()

        val context = ExecutionContextImpl()
        context.setConfigProperty("keepModeling", true)
        context.setConfigProperty("diagramName", EcoreUtil.getURI(inputModel1).trimFileExtension().lastSegment())

        require(System.out != null) { "System.out was null!" }
        val outStream = OutputStreamWriter(System.out!!)
        val log = WriterLog(outStream)
        context.log = log

        val result = executor.execute(context, input1, input2, output)

        if (result.severity == Diagnostic.OK) {
            require(!output.contents.isNullOrEmpty()) { "No transformation result!" }
            return output.contents[0]
        } else {
            throw IllegalArgumentException(result.toString())
        }
    }
}
