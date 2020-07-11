package de.unia.se.plantestic

import edu.uoc.som.openapi2.io.OpenAPI2Importer
import edu.uoc.som.openapi2.io.model.SerializationFormat
import org.eclipse.emf.ecore.EObject
import java.io.File
import com.moandjiezana.toml.Toml
import java.lang.Exception

class OpenAPIParser constructor(private val inputFile: File) {

    fun generateModel() : EObject? {
        val confname = inputFile.absolutePath.substringBeforeLast(".") + "_config.toml"
        val tomlMap = Toml().parse(File(confname))

        val conf = tomlMap.getTable("SWAGGER") ?: return null;
        if (conf.isEmpty) return null;
        val url = conf.getString("url")
        if (url != null) return OpenAPI2Importer().createOpenAPI2ModelFromURL(
            url, SerializationFormat.JSON
        )
        val jsonFile = conf.getString("json-file")
        if (jsonFile != null) return OpenAPI2Importer().createOpenAPI2ModelFromFile(File(jsonFile), SerializationFormat.JSON)
        val yamlFile = conf.getString("yaml-file")
        if (yamlFile != null) return OpenAPI2Importer().createOpenAPI2ModelFromFile(File(yamlFile), SerializationFormat.YAML)
        throw Exception("Swagger defined, but no source given");
    }

}