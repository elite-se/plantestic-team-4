package de.unia.se.plantestic

import edu.uoc.som.openapi2.io.OpenAPI2Importer
import edu.uoc.som.openapi2.io.OpenAPI2Builder
import edu.uoc.som.openapi2.io.model.SerializationFormat
import org.eclipse.emf.ecore.EObject
import java.io.File
import java.net.URI

object OpenAPIParser {

    fun generateModel(spec: File) : EObject {
        return OpenAPI2Importer().createOpenAPI2ModelFromURL(
            "http://localhost:8080/swagger.json", SerializationFormat.JSON
        )
    }

}