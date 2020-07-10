package de.unia.se.plantestic

import edu.uoc.som.openapi2.io.OpenAPI2Importer
import edu.uoc.som.openapi2.io.model.SerializationFormat
import java.io.File
import java.net.URI

object OpenAPIParser {

    fun generateModel(spec: File) {
        val swModel = OpenAPI2Importer().createOpenAPI2ModelFromFile(spec, SerializationFormat.JSON)
    }

}