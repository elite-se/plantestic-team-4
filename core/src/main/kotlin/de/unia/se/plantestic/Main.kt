package de.unia.se.plantestic

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import java.io.File
import com.moandjiezana.toml.Toml
import org.eclipse.emf.ecore.*
import de.unia.se.plantestic.generated.*
import de.unia.se.plantestic.generated.impl.*

object Main {

    class Cli : CliktCommand(
        printHelpOnEmptyArgs = true,
        help = "Plantestic is a tool that transforms UML sequence diagrams of REST APIs into Java unit tests.",
        epilog = """
        |The UML sequence diagrams must be specified with PlantUML.
        |Arrows between actors are considered as requests and responses.
        |Actors are considered services. The actor with the first outgoing arrow is considered the client.
        |Test cases emulate requests of the client against other actors.
        |
        |DIAGRAM FORMAT
        |==============
        |
        |The text on arrows need to follow a certain format to be recognized as requests or responses.
        |For requests, this is:
        |
        |   <METHOD> "<PATH>" (<PARAM_NAME> : "<PARAM_VALUE>"[, ...])
        |
        |Where <METHOD> is one of 'GET', 'POST', 'PUT', 'DELETE', 'PATCH'
        |<PATH> is the relative URL.
        |Params are parameter pairs. Depending on the type of request, they will either be used as query or form params.
        |
        |All values that are in quotes can contain arbitrary variable substitutions of the form "$\{VARIABLE_NAME\}".
        |Variables can either be imported via the configuration file or from previous responses.
        |
        |Similarly, responses need to follow the following schema:
        |
        |<CODE>
        |  or
        |<CODE> - (<VARIABLE_NAME> : "<XPATH_TO_VARIABLE>"[, ...])
        |
        |Where <CODE> is one or a comma-separated list of allowed HTTP response codes.
        |<XPATH_TO_VARIABLE> is a path to a certain value in a JSON or XML body following the XPATH scheme.
        |The value of <XPATH_TO_VARIABLE> will be checked for being present and will then be assigned to
        |<VARIABLE_NAME> for later use.
        |
        |Plantestic also allows conditional requests. They should be put in UML "alt" blocks within PlantUML.
        |The condition might be any valid JavaScript code with any arbitrary templating variables.
        |Before the code will be evaluated, the templating engine will replace all variables in "$\{VAR\}".
        |The condition should return true or false.
        |
        |CONFIG FILE
        |===========
        |
        |Because your test might contain sensitive data or data you quickly want to change between tests,
        |Plantestic also supports config files in .toml format.
        |You can define arbitrary variables and their values in the [Templating] section.
        |Every service might additionally get values for "path", "username" and "password".
        |
        |Example:
        |--------
        |
        |[Templating]
        |id = "asdf"
        |important_value = 5
        |
        |[ServiceA]
        |path = "www.example.com"
        |username = "admin"
        |password = "admin"
        |
        |LEGAL
        |=====
        |
        |This software is licensed under Apache 2.0 license and was developed by 
        |Andreas Zimmerer, Stefan Grafberger, Fiona Guerin, Daniela Neupert and Michelle Martin.
        """.trimMargin()) {

        private val input: String by option(help = "Path to the PlantUML file containing the API specification.")
            .required()
		private val config: String? by option(help = "Path to the toml config containing information on async requests.")
        private val output: String by option(help = "Output folder where the test cases should be written to. Default is './plantestic-test'")
            .default("./plantestic-test")

        override fun run() {
            val inputFile = File(input).normalize()
            val outputFolder = File(output).normalize()
			
			var configFile: File? = null
			if (config != null) {
				configFile = File(config).normalize()
			}

            if (!inputFile.exists()) {
                echo("Input file ${inputFile.absolutePath} does not exist.")
                return
            }

            runTransformationPipeline(inputFile, outputFolder, configFile)
        }
    }

    fun runTransformationPipeline(inputFile: File, outputFolder: File, configFile: File?) {
        MetaModelSetup.doSetup()

        val pumlDiagramModel = PumlParser.parse(inputFile.absolutePath)

        val requestResponsePairsModel = M2MTransformer.transformPuml2ReqRes(pumlDiagramModel)
		val configModel = loadConfig(configFile);
		val requestResponsePairsModelWithAsync = M2MTransformer.transformReqRes2ReqRes(requestResponsePairsModel, configModel)
        val restAssuredModel = M2MTransformer.transformReqRes2RestAssured(requestResponsePairsModelWithAsync)

        println("Generating code into $outputFolder")
        AcceleoCodeGenerator.generateCode(restAssuredModel, outputFolder)
    }
	
	fun loadConfig(configFile: File?): EObject {
		
		// TODO assert that config File is null only if there are no async requests
		var factory = ConfigmetamodelFactoryImpl()
		var configList : ConfigList = factory.createConfigList()
		
		if (configFile != null) {
			var tomlMap = Toml().read(String(configFile.readBytes())).toMap()
			
			for(key in tomlMap.keys) {
				var valueMap = tomlMap.get(key) as Map<String, Any>
				
				var asyncConfig : AsyncRequestConfig = factory.createAsyncRequestConfig()
				
				asyncConfig.setId(key)
				asyncConfig.setTimeout(valueMap.get("timeout") as Int)
				asyncConfig.setRequestMethod(valueMap.get("requestMethod") as String)
				asyncConfig.setRequestURL(valueMap.get("requestURL") as String)
				asyncConfig.setResponseStatusCode(valueMap.get("responseStatus").toString())
				
				// TODO response parameter
				// TODO request parameter
				
				
				
				configList.getAsyncConfig().add(asyncConfig)
			}
		}
		
		
		println(configList)
		return configList
	}

    @JvmStatic
    fun main(args: Array<String>) = Cli().main(args)
}
