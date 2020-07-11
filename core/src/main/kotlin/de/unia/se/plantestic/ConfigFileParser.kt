package de.unia.se.plantestic

import java.io.File
import com.moandjiezana.toml.Toml
import org.eclipse.emf.ecore.*
import de.unia.se.plantestic.generated.*
import de.unia.se.plantestic.generated.impl.*

object ConfigFileParser {
	
	@Suppress("UNCHECKED_CAST")
	fun loadConfig(configFile: File?): EObject {
		
		// TODO assert that config File is null only if there are no async requests
		var factory = ConfigmetamodelFactoryImpl()
		var configList : ConfigList = factory.createConfigList()
		
		if (configFile != null) {
			var tomlMap = Toml().read(String(configFile.readBytes())).toMap()
			
			for(key in tomlMap.keys) {
				
				var valueMap = tomlMap.get(key) as Map<String, Any>
				
				var asyncConfig : AsyncRequestConfig = factory.createAsyncRequestConfig()
				
				setAsyncParameters(asyncConfig, valueMap, key)
				
				if (valueMap.containsKey("requestParameter")) {
					var requestParameterList = valueMap.get("requestParameter") as List<List<String>>
					for(paramPair in requestParameterList) {
						var requestParameter = factory.createRequestParameter()
						requestParameter.setRequestVariableName(paramPair[0])
						requestParameter.setValue(paramPair[1])
						
						asyncConfig.getRequestParameter().add(requestParameter)
					}
				}
				
				if (valueMap.containsKey("responseParameter")) {
					var responseParameterList = valueMap.get("responseParameter") as List<List<String>>
					for(paramPair in responseParameterList) {
						var responseParameter = factory.createResponseParameter()
						responseParameter.setResponseVariableName(paramPair[0])
						responseParameter.setXPath(paramPair[1])
						
						asyncConfig.getResponseParameter().add(responseParameter)
					}
				}
				
				configList.getAsyncConfig().add(asyncConfig)
			}
		}
		return configList
	}
	
	fun setAsyncParameters(asyncConfig: AsyncRequestConfig, valueMap: Map<String, Any>, key: String) {
		asyncConfig.setId(key)
		asyncConfig.setTimeout((valueMap.get("timeout") as Long).toInt())
		asyncConfig.setRequestMethod(valueMap.get("requestMethod") as String)
		asyncConfig.setRequestURL(valueMap.get("requestURL") as String)
		asyncConfig.setResponseStatusCode(valueMap.get("responseStatus").toString())
	}
}