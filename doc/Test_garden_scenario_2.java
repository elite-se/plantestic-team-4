import com.jayway.jsonpath.matchers.JsonPathMatchers;
import com.moandjiezana.toml.Toml;
import io.restassured.RestAssured;
import io.restassured.internal.assertion.Assertion;
import io.restassured.response.Response;
import org.apache.commons.text.StringSubstitutor;
import org.hamcrest.collection.IsIn;
import org.junit.jupiter.api.Test;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test_garden_scenario_2 {

	Map<String, Object> paramsMap;
	ScriptEngine engine;
	StringSubstitutor substitutor;

	public Test_garden_scenario_2() {
		try {
			File config = new File("plantestic-test/garden_scenario_2_config.toml");
			paramsMap = unnestTomlMap("", new Toml().read(config).toMap());
			substitutor = new StringSubstitutor(paramsMap);
			engine = new ScriptEngineManager().getEngineByName("JavaScript");
		} catch(Exception exception) {
			System.out.println("An Error occured, possible during reading the TOML config file: " + exception);
			throw exception;
		}
	}

	private Throwable error;

    @Test
	public void test() throws Throwable {
		Response roundtrip1 = RestAssured.given()
		        .auth().basic(subst("${GA.username}"), subst("${GA.password}"))
		    .when()
		        .post(subst("${GA.path}") + subst("/garden/plant/${plantType1}"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))
		            		.body(JsonPathMatchers.hasJsonPath("plantId"))
		            	.and().extract().response();
		paramsMap.put("plantId1", roundtrip1.jsonPath().getString("plantId"));
		Thread t = new Thread(() -> {
					try {
						Thread.sleep(1);

						Response roundtrip_async_1 = RestAssured.given()
								.auth().basic(subst("${GA.username}"), subst("${GA.password}"))
								.when()
								.get(subst("${GA.path}") + subst("/farmer/hasplant/${plantId1}"))
								.then()
								.assertThat()
								.statusCode(IsIn.isIn(Arrays.asList(200)))
								.and().extract().response();
						paramsMap.put("plantId5", roundtrip_async_1.jsonPath().getString("plantId"));
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (Throwable e) {
						error = e;
					}
					System.out.println(paramsMap);
				});
		t.start();
		t.join();
		if (error != null) {
			throw error;
		}


		Response roundtrip2 = RestAssured.given()
		        .auth().basic(subst("${PL.username}"), subst("${PL.password}"))
		    .when()
		        .get(subst("${PL.path}") + subst("/plant/timetogrow/${plantType1}"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))
		            		.body(JsonPathMatchers.hasJsonPath("ttgrow"))
		            	.and().extract().response();


		Response roundtrip3 = RestAssured.given()
		        .auth().basic(subst("${GA.username}"), subst("${GA.password}"))
		    .when()
		        .post(subst("${GA.path}") + subst("/garden/plant/${plantType2}"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))
		            		.body(JsonPathMatchers.hasJsonPath("plantId"))
		            	.and().extract().response();
		paramsMap.put("plantId2", roundtrip3.jsonPath().getString("plantId"));


		Response roundtrip4 = RestAssured.given()
		        .auth().basic(subst("${PL.username}"), subst("${PL.password}"))
		    .when()
		        .get(subst("${PL.path}") + subst("/plant/timetogrow/${plantType2}"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))
		            		.body(JsonPathMatchers.hasJsonPath("ttgrow"))
		            	.and().extract().response();
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
