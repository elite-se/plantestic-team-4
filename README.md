# Plantestic
![plantestic](https://img.shields.io/badge/🌱-plantestic-green.svg)
[![Build Status](https://travis-ci.com/FionaGuerin/plantestic.svg?token=qCz9ynu1x7xYBT4zA1MS&branch=master)](https://travis-ci.com/FionaGuerin/plantestic/builds)

## Description
The test case generator Plantestic produces test cases from a sequence diagram.
A sequence diagram models a sequence of interactions between objects.
A test case then checks for such an interaction whether it is implemented as the sequence diagram defines it.
In an example sequence diagram called `Hello`, let there be two actors Alice and Bob.
Alice sends Bob the request `GET /hello ` and Bob answers with `Hello World`.
The corresponding test case now sends an HTTP request `GET /hello` to the backend.
The test case then expects a response with status `200 OK` and date `Hello World`.

![./core/src/test/resources/minimal_hello.png](./core/src/test/resources/minimal_hello.png)

```
public void test() throws Exception {
		try {
			Response roundtrip1 = RestAssured.given()
					.auth().basic(substitutor.replace("${B.username}"), substitutor.replace("${B.password}"))
				.when()
					.get(substitutor.replace("${B.path}") + substitutor.replace("/hello"))
				.then()
					.assertThat()
					    .statusCode(IsIn.isIn(Arrays.asList(200)));
		} catch (Exception exception) {
			System.out.println("An error occured during evaluating the communication with testReceiver: ");
			exception.printStackTrace();
			throw exception;
		}
	}
```

## Motivation
The implementation of user requirements often deviates from the specification of the same user requirements.
Individual work, teamwork, and collaboration between teams can produce such a divergence.
For example, requirements may be misinterpreted or overlooked.
Teamwork, especially with multiple teams, causes interface errors.
For example, subsystems of the same product may use conflicting technologies or conflicting data formats.

Our test case generator detects deviations at an early stage:
The test case generator derives test cases directly from the specification.
If the implementation fulfills these test cases, then the implementation fulfills the specification.
If the implementation does not fulfill these test cases, the implementation deviates from the specification.
With our test case generator, developers can quickly uncover inconsistencies, fix them, and save costs.

## Features
Plantestic is universal in that it can run in any IDE.
For this, Plantestic uses Gradle.

Plantestic is user-friendly:
You set it up by installing Java and downloading Plantestic.
You generate a test case by filing a sequence diagram and entering one instruction.

Plantestic has a powerful condition evaluation:
A sequence diagram can contain alternative or optional interactions that it invokes under a certain condition.
Plantestic will evaluate any condition that conforms to JavaScript.
For this, it uses a JavaScript engine.

You can pass parameters to your sequence diagram if you wish to customize its flows.
For example, you no longer need to reveal security-critical information such as passwords in your sequence diagram.
Plantestic evaluates the parameters using templating.

## New Features

### Swagger based demo Server

To run our custom examples we included a Swagger based demo server that offers a description of the example routes. It can be found in the `demo-server` folder.  

### Ignore Requests

It is now possible to ignore a Request-Response Pair. This is done by adding a `?` before the `GET/POST`. This is shown in the example `garden_scenario_2.puml`.

For this to work we extended the Xtext grammar such that those pairs get parsed differently.

### Asynchronous Request-Response Pairs

It is now possible to have Asynchronous Request-Response Pairs as an answer to a Request-Response pair. The Asynchronous Request-Response Pair is an additional Request-Response pair, which will be executed after a customisable time interval after the original pair.
To illustrate this imagine the following:

We have a request
```puml
A -> B : ["1"] POST "/kickoff"
B -> A : 200

... // Some time passes
 
B -> A : ? POST "/update" (result : "async_update")
A -> B : 200
```

We now want to test that A actually received the asynchronous update from B triggered by the initial `POST`.
To do this properly it is required to specify some domain knowledge on which calls should be executed via a separate config file (see below).

**FOR THIS TO WORK YOU NEED TO HAVE TEST ROUTES THAT CAN CHECK WHETHER AN UPDATE ARRIVED OR NOT.**

Let's say we have a route `A/check_update` that returns 200 if and only if the asynchronous update
has arrived. 
We will now provide a compile time configuration (default name: "`<test_case_name>_compile_config.toml`") that
looks like this:
```toml
[1] #Has to be the same as the id assigned in the puml (but without the `"`) 
    timeout = 500 #Set how long we will wait for the call
    requestMethod = 'GET'
    requestURL = '/check_update'
    requestParameters = [] #Set request parameters here (like the response Parameters)
    responseStatus = 200
    responseParameter = [['usefulLater', 'result']] #Collect parameters if call returns some
```  
If this file has the default name and resides in the same directory as the `.puml` file it will be 
automatically detected. If not you have to provide the argument `"--config=<path-to-config>"` in the gradlew run args
(`./gradlew run --args="--input=<path-to-input> --config=<path-to-config>`).

The config file will be parsed during our model transformations and its content will be included in our generated models. This is achieved by a QVTo Model to Model Transformation that merges the additional asynchronous Request-Response Pairs with the existing ones.
Furthermore, the Xtext grammar was once again extended to include parsing of the pair ids (e.g. ["1"] in the example above). The new asynchronous pairs are then also included in the Swagger integration (see below).

### Fixed: JSON Body Paths now get tested!

During the integration of new features we encountered an issue with the check of the existence of certain json paths:
There were none.
We fixed this by adapting adding a new matcher to the test, that will check for the path in the `json`.
A note to take here: **The `/` in the JSON xPath in the Diagramm will be replaced by `.`**. The first leading `/` will be trimmed.

### Swagger Integration

It is now possible to include a Swagger API into the model in order to enable some automated checks of the request and response parameters and variables. To do this just provide the path or url in the 
compile config:

```toml
# in file "test_scenario_compile_config.toml
# ... Async Config etc. 

[SWAGGER]
    url= "localhost:8080/swagger.json"
    json-path= "path/to/swagger.json"
    yaml-path= "path/to/swagger.yaml"
```

If multiple options are available then the order in the example above corresponds to the priority which option will be taken.
Again, the config file with the Swagger info will automatically be loaded if it follows the default naming convention and resides
in the same directory.

This integration is achieved by a QVTo Model Merge, that integrates sources of the openapi model into the 
RestAssured model.
 
### Misc

+ The Puml Xtext grammar is now trimmed to only parse Sequence Diagrams.
+ There are new examples all under our **brand new** garden model. If you like plants at all be sure to check them out.


## Installation
1. Install Java SE Development Kit 8 or higher (it has been tested with JDK11 and JDK8).
You can find Java SE Development Kit 8 under the website [https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
2. Clone the Plantestic repository.
3. Run `git submodule init` and `git submodule update`.
4. Install maven (if not already installed).
5. Go to `openapi-metamodel/openapi2` and run `mvn install`.
6. Go to `openapi-metamodel/openapi2/plugins/edu.uoc.som.openapi2.io` and run `mvn install`.
7. Go to `openapi-metamodel/openapi2/plugins/edu.uoc.som.openapi2.mm` and run `mvn install`.
8. Run `./gradlew build`.

## How to use
### Input requirements
The input is a PlantUML sequence diagram.
This sequence diagram contains several participants and interactions between the participants.
One participant is the client who calls the test cases. The other participants are services of the implementation.
In the example diagram, the client is `CCC` and the services are `CRS` and `Voicemanager`.

An interaction contains a request from the client and a response from a service.
A request contains an HTTP method, a URL, and possibly parameters.
A response contains an HTTP status code and, if applicable, data. A hyphen separates the HTTP status codes and the data.

The HTTP method is `GET`, `POST`, or `PUT`.

The URL path is a String. In it, slashes separate the path components.
A parameter name in curly braces, preceded by a dollar symbol, thereby specifies parameterized path components.
Example: ```/path/${param}```

We specify the request parameters in a tuple:
An opening bracket is followed by the first request parameter.
This request parameter is followed - comma-separated - by the second request parameter, and so on.
The last request parameter is followed by a closing bracket.
We specify the request parameter as a `Name: Value` pair:
The name of the request parameter is followed by a space, a colon, a space, and the value of the request parameter as a string.
We define the value of the request parameter in curly brackets, preceded by a dollar symbol.
Example: ```(name1 : "${value1}", name2 : "${value2}")```

We specify the response data in a tuple:
An opening bracket is followed by the first response datum.
This response datum is followed - comma-separated - by the second response datum, and so on.
The last response datum is followed by a closing bracket.
We specify the response datum as a `Name: XPath` pair:
The name of the response datum is followed by a space, a colon, a space, and the jsonpath of the response datum as a string.
In the jsonpath, dots separate the path components. .
Example: ```(name1 : "value.value1", name2 : "value2")```

![./core/src/test/resources/rerouting.png](./core/src/test/resources/rerouting.png)

### Execution
1. Create a PlantUML sequence diagram. Note the input requirements above.
2. Save the sequence diagram.
3. Call the command `./gradlew run --args="--input=<path/to/sequence/diagram/diagram_name.puml>"`.

### Output expectation
The generated test cases are in `core/plantestic-test/`.

Some ClassCastExceptions may be thrown during the model transformation, but they are harmless and do not impact the transformation result.

## Demo
Take the following test case generation from a minimal sequence diagram as an example:

1. You can find the sequence diagram `minimal_hello.puml` in the Plantestic project under `./core/src/test/resources/minimal_hello.puml`:

![./core/src/test/resources/minimal_hello.png](./core/src/test/resources/minimal_hello.png)

2. In the Plantestic console, call `./gradlew run --args="--input=./src/test/resources/minimal_hello.puml"`.
This will generate test cases for the provided diagram.

3. You will find the test case in the Plantestic project under `./core/plantestic-test/Test_minimal_hello_puml.java`:

```
import com.jayway.jsonpath.matchers.JsonPathMatchers;
import com.moandjiezana.toml.Toml;
import io.restassured.RestAssured;
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

public class Test_minimal_hello {

	Map<String, Object> paramsMap;
	ScriptEngine engine;
	StringSubstitutor substitutor;

	public Test_minimal_hello() {
		try {
			File config = new File("plantestic-test/minimal_hello_config.toml");
			paramsMap = unnestTomlMap("", new Toml().read(config).toMap());
			substitutor = new StringSubstitutor(paramsMap);
			engine = new ScriptEngineManager().getEngineByName("JavaScript");
		} catch(Exception exception) {
			System.out.println("An Error occured, possible during reading the TOML config file: " + exception);
			throw exception;
		}
	}

    @Test
	public void test() {
		Response roundtrip1 = RestAssured.given()
		        .auth().basic(subst("${B.username}"), subst("${B.password}"))
		    .when()
		        .get(subst("${B.path}") + subst("/hello"))
		    .then()
		        .assertThat()
		            .statusCode(IsIn.isIn(Arrays.asList(200)))	.and().extract().response();
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
```

## Limitations
- When actor A sends actor B a request, Plantestic expects actor B to send actor A a response.
    Actors A and B must be different actors.
- Plantestic neither supports options nor loops.
- Plantestic can handle alternatives as long as they are not nested.
- We only support authenticated requests with username and password.

## Credits
### Original Contributors
- [Stefan Grafberger](https://github.com/stefan-grafberger) *
- [Fiona Guerin](https://github.com/FionaGuerin) *
- [Michelle Martin](https://github.com/MichelleMar) *
- [Daniela Neupert](https://github.com/danielaneupert) *
- [Andreas Zimmerer](https://github.com/Jibbow) *

\* contributed equally

### Contributors Async-Swagful-Plantestic
- [Julia Maria Brenner](https://github.com/JuliaMariaBr) *
- [Christina Karle](https://github.com/ckaarle) *
- [Michael Markl](https://github.com/schedulaar) *
- [Henrik Wachowitz](https://github.com/ricffb) *

\* contributed equally to the updates

### Repositories

#### openapi-metamodel
This repository is contained as a submodule. It provides the ecore Metamodel as well as an import function 
that allows for parsing the Swagger file into an UML Model.

#### plantuml-eclipse-xtext
The repository [plantuml-eclipse-xtext](https://github.com/Cooperate-Project/plantuml-eclipse-xtext) defines the grammar of PlantUML.
We pass this grammar to Xtext.

#### qvto-cli
The repository [qvto-cli](https://github.com/mrcalvin/qvto-cli) demonstrates how QVT operations can be performed without Eclipse.

### Literature
#### Standalone Parsing with Xtext
From the article [Standalone Parsing with Xtext](http://www.davehofmann.de/different-ways-of-parsing-with-xtext/) we learned how to use Xtext without Eclipse.

#### QVTOML/Examples/InvokeInJava
From the Wiki article [QVTOML/Examples/InvokeInJava](https://wiki.eclipse.org/QVTOML/Examples/InvokeInJava) we learned how to call QVT from our pipeline.

#### Grammar-based Program Generation Based on Model Finding
From the paper [Grammar-based Program Generation Based on Model Finding](http://www.informatik.uni-bremen.de/agra/doc/konf/13_idt_program_generation.pdf) we learned about the Eclipse Modeling Framework.

## License
Copyright [2019] [Stefan Grafberger, Fiona Guerin, Michelle Martin, Daniela Neupert, Andreas Zimmerer]
Copyright New Features [2020] [Julia Brenner, Christina Karle, Michael Markl, Henrik Wachowitz]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
