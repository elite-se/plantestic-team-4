package com.plantestic.test;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.collection.IsIn;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.text.StringSubstitutor;
import com.moandjiezana.toml.Toml;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.junit.jupiter.api.Test;

public class Testgarden_scenario_2_puml {

	Map<String, Object> paramsMap = new HashMap();
	ScriptEngine engine;
	StringSubstitutor substitutor;

	// FIXME: no IS_WINDOWS please
	private static final boolean IS_WINDOWS = System.getProperty( "os.name" ).contains( "indow" );

	public Testgarden_scenario_2_puml(String configFile) throws Exception {
		try {
			String osAppropriatePath = IS_WINDOWS ? configFile.substring(1) : configFile;
			Path path = Paths.get(osAppropriatePath);

			paramsMap = unnestTomlMap("", new Toml().read(new String(Files.readAllBytes(path))).toMap());
			substitutor = new StringSubstitutor(paramsMap);
			engine = new ScriptEngineManager().getEngineByName("JavaScript");
		} catch(Exception exception) {
			System.out.println("An Error occured, possible during reading the TOML config file: " + exception);
			throw exception;
		}
	}

    @Test
	public void test() throws Exception {
		Response roundtrip1 = RestAssured.given()
		        .auth().basic(subst("${GA.username}"), subst("${GA.password}"))
		    .when()
		        .post(subst("${GA.path}") + subst("garden/plant/0"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))        
		        	.and().extract().response();
		paramsMap.put("plantId1", roundtrip1.jsonPath().getString("plantId"));
		paramsMap.put("plantType1", roundtrip1.jsonPath().getString("plantType"));


		Response roundtrip2 = RestAssured.given()
		        .auth().basic(subst("${PL.username}"), subst("${PL.password}"))
		    .when()
		        .get(subst("${PL.path}") + subst("plant/timetogrow/0"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))        
		        	.and().extract().response();
		paramsMap.put("timetogrow1", roundtrip2.jsonPath().getString("timetogrow"));


		Response roundtrip3 = RestAssured.given()
		        .auth().basic(subst("${GA.username}"), subst("${GA.password}"))
		    .when()
		        .post(subst("${GA.path}") + subst("garden/plant/1"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))        
		        	.and().extract().response();
		paramsMap.put("plantId2", roundtrip3.jsonPath().getString("plantId"));
		paramsMap.put("plantType2", roundtrip3.jsonPath().getString("plantType"));


		Response roundtrip4 = RestAssured.given()
		        .auth().basic(subst("${PL.username}"), subst("${PL.password}"))
		    .when()
		        .get(subst("${PL.path}") + subst("plant/timetogrow/1"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))        
		        	.and().extract().response();
		paramsMap.put("timetogrow2", roundtrip4.jsonPath().getString("timetogrow"));

		new Thread(() -> System.out.println("Hello World!").start();
	}

    /// Helper method to make to templating in string variables above more clean.
	private String subst(String source) {
	    assert substitutor != null;
	    return substitutor.replace(source);
	}

	/// Helper method to make evaluation of conditions more clean.
	private boolean eval(String condition) throws ScriptException {
	    assert engine != null;
	    // First, run the templating engine over the condition.
	    // This is the whole reason why we do this "evaluate a JS string at runtime" at all.
	    String substCondition = subst(condition);
	    // Second, we can simply pipe the string through the JavaScript engine and get a result.
	    return (Boolean) engine.eval(substCondition);
	}

    /// Helper method to flatten the tree-like structure of a TOML file.
    /// Here, we use the path of an item as the key and the item itself as the value.
    /// The path of an item separated by dots, e.g. "A.B.item".
	private static Map<String, Object> unnestTomlMap(String prefix, Map<String, Object> tree) {
        Map<String, Object> resultMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : tree.entrySet()) {
            String identifierPath = prefix + entry.getKey();
            if(entry.getValue() instanceof Map){
                resultMap.putAll(unnestTomlMap(identifierPath + ".", (Map<String, Object>)entry.getValue()));
            } else {
                resultMap.put(identifierPath, entry.getValue());
            }
        }
        return resultMap;
	}
}
