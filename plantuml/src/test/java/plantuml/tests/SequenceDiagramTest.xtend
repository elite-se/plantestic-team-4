package plantuml.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import plantuml.puml.*
import static org.junit.Assert.*


@ExtendWith(InjectionExtension)
@InjectWith(PumlInjectorProvider)
class SequenceDiagramTest {

	@Inject extension ParseHelper<UmlDiagram>

	@Test def void testParse() {
		val heros = '''
			SEQUENCE @startuml
			AUTONUMBER "<b>[00]"  
			SKINPARAM SEQUENCE{
			    lo F12
				lo #12
				lo #F1ab2
				lo 12
			}
			PARTICIPANT test
			PARTICIPANT test2
			@enduml
		'''.parse

		assertEquals(4, (heros.umlDiagrams.head as SequenceUml).umlElements.size)
		assertEquals(((heros.umlDiagrams.head as SequenceUml).umlElements.get(3) as Participant).name, "test2")
	}

	@Test def void testParseParticipant() {
		val heros = '''
			SEQUENCE @startuml
				PARTICIPANT TEST
				PARTICIPANT "abcde" AS AB
			@enduml
		'''.parse

		assertEquals(2, (heros.umlDiagrams.head as SequenceUml).umlElements.size)
		assertEquals(((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Participant).name, "TEST")

	//		assertEquals(((heros.umlDiagrams.head as SequenceUml).umlElements.get(1) as UmlParticipantLong).name, "AB")
	}

	@Test def void testParseBoxWithColor() {
		val heros = '''
			SEQUENCE @startuml
			BOX 'ST' #1234
				PARTICIPANT TEST
				PARTICIPANT "abcde" AS AB
				PARTICIPANT FGH
			END BOX
			@enduml
		'''.parse

		assertEquals(1, (heros.umlDiagrams.head as SequenceUml).umlElements.size)
		assertEquals(3, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Box).umlElements.size)
	}

	@Test def void testParseBox() {
		val heros = '''
			SEQUENCE @startuml
			   BOX 'ST'
				PARTICIPANT TEST
				PARTICIPANT "abcde" as AB
				PARTICIPANT FGH
			END BOX
			@enduml
		'''.parse
		assertEquals(1, (heros.umlDiagrams.head as SequenceUml).umlElements.size)
		assertEquals(3, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Box).umlElements.size)
	}

	@Test def void testParseGroup() {
		val heros = '''
			SEQUENCE @startuml
			PARTICIPANT TEST
			PARTICIPANT abcde AS AB
			PARTICIPANT FGH
			GROUP No change
				TEST -> AB
				AB -> FGH
			END
			@enduml
		'''.parse
		System.out.println((heros.umlDiagrams.head as SequenceUml).umlElements)
		assertEquals(4, (heros.umlDiagrams.head as SequenceUml).umlElements.size)
		assertEquals(2, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(3) as Group).umlElements.size)
	}

	@Test def void testParseUse() {
		val heros = '''
			SEQUENCE @startuml
			PARTICIPANT TEST
			PARTICIPANT AB
			TEST -> AB : this is foo
			AB -> TEST : Give something
			@enduml
		'''.parse
		assertEquals(4, (heros.umlDiagrams.head as SequenceUml).umlElements.size)
	}

	@Test def void testParseUseNew() {
		val heros = '''
			SEQUENCE @startuml
			PARTICIPANT test
			PARTICIPANT test2
			test -> test2
			PARTICIPANT "fo\n123l l" AS lol
			PARTICIPANT "fooLong" AS foo
			foo --> lol
			foo <-- lol
			foo <- lol
			[<- lol
			@enduml
		'''.parse
		assertEquals("test", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).userOne.name)
		assertEquals("test2", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(5) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(5) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(6) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(6) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(7) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(7) as UmlUse).userTwo.name)
	}

	@Test def void testAlt() {
		val heros = '''
			SEQUENCE @startuml
			PARTICIPANT test
			PARTICIPANT test2
			ALT "Successful ABC lookup"
				test ->] : Forward something via ABC
			ELSE "Failed ABS lookup"
				test2 -> test : Reject ABC\nvia DEV 
			END
			@enduml
		'''.parse
		assertEquals(3, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals("Successful ABC lookup",
			((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as Alternative).text.toString())
		assertEquals(1, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as Alternative).elseBlocks.size)
		assertEquals("Failed ABS lookup",
			(((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as Alternative).elseBlocks.get(0) as Else).text.toString())
		assertEquals("[Reject, ABC\\nvia, DEV]",
			((((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as Alternative).elseBlocks.get(0) as Else).umlElements.
				get(0) as UmlUse).text.toString())

	}

	@Test def void testLegend() {
		val heros = '''
			SEQUENCE @startuml
			LEGEND
				ABC = "asdfjb" is something
				AZC = is nothing
			ENDLEGEND
			@enduml
		'''.parse
		assertEquals(1, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals(9, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Legend).legendEntries.size)
	}

	@Test def void testTitle() {
		val heros = '''
			SEQUENCE @startuml
			TITLE test hallo
			@enduml
		'''.parse
		assertEquals(1, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals(2, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Title).value.size)
	}

	@Test def void testNewpage() {
		val heros = '''
			SEQUENCE @startuml
			NEWPAGE test hallo
			@enduml
		'''.parse
		assertEquals(1, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals(2, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Newpage).value.size)
	}

	@Test def void testNote() {
		val heros = '''
			SEQUENCE @startuml
			NOTE LEFT
				This is **bold**
				This is //italics//
				This is ""monospaced""
				END NOTE
			@enduml
		'''.parse
		assertEquals(1, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals("**bold**", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Note).value.get(2))
		assertEquals("//italics//", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Note).value.get(5))
	}

	@Test def void testDivider() {
		val heros = '''
			SEQUENCE @startuml
				== Initialization ==
				Alice -> Bob: Authentication Request
				Bob --> Alice: Authentication Response
				== Repetition test ==
				Alice -> Bob: Another authentication Request
				Alice <-- Bob: another authentication Response
			@enduml
		'''.parse
		assertEquals(6, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals("Initialization", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(0) as Divider).name)
		assertEquals("Repetition", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(3) as Divider).name)
	}

	@Test def void testReference() {
		val heros = '''
			SEQUENCE @startuml
				PARTICIPANT Alice
				ACTOR Bob
				REF OVER Alice , Bob : init
				Alice -> Bob : hello
				REF OVER Bob
				This can be on
				several lines
				END REF
			@enduml
		'''.parse
		assertEquals(5, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals("init", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as Reference).value.get(0))
		assertEquals("This", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(4) as Reference).value.get(0))
	}

	@Test def void testDelay() {
		val heros = '''
			SEQUENCE @startuml
				PARTICIPANT Alice
				ACTOR Bob
				Alice -> Bob : Authentication Request
				... ...
				Bob --> Alice : Authentication Response
				... five minutes later ...
				Bob --> Alice: Bye
			@enduml
		'''.parse
		assertEquals(7, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals(0, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(3) as Delay).value.size)
		assertEquals("five", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(5) as Delay).value.get(0))
	}

	@Test def void testSpace() {
		val heros = '''
			SEQUENCE @startuml
				PARTICIPANT Alice
				ACTOR Bob
				Alice -> Bob: message one
				Bob --> Alice: ok
				|||
				Alice -> Bob: message two
				Bob --> Alice: ok
				|||
				Alice -> Bob: message three
			@enduml
		'''.parse
		assertEquals(9, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals(null, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(4) as Space).value)
	}

	@Test def void testActivate() {
		val heros = '''
			SEQUENCE @startuml
				PARTICIPANT Alice AS A
				ACTOR Bob AS B
				PARTICIPANT User
				User -> A: DoWork
				ACTIVATE A
				A -> B: createRequest
				ACTIVATE B
				B -> B: DoWork
				ACTIVATE User
				User --> B: WorkDone
				DESTROY User
				B --> A: RequestCreated
				DEACTIVATE B
				A -> User: Done
				DEACTIVATE A
			@enduml
		'''.parse
		assertEquals(5, ((heros.umlDiagrams.head as SequenceUml).umlElements.size))
		assertEquals(3, ((heros.umlDiagrams.head as SequenceUml).umlElements.get(4) as Activate).umlElements.size);
	}

	@Test def void testParseUseWithO() {
		val heros = '''
			SEQUENCE @startuml
			PARTICIPANT test
			PARTICIPANT test2
			test ->o test2
			PARTICIPANT "fo\n123l l" AS lol
			PARTICIPANT "fooLong" AS foo
			foo o--> lol
			foo o<--o lol
			foo <-o lol
			[o<- lol
			@enduml
		'''.parse
		assertEquals("test", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).userOne.name)
		assertEquals("test2", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(5) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(5) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(6) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(6) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(7) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(7) as UmlUse).userTwo.name)
	}

	@Test def void testParseUseWithX() {
		val heros = '''
			SEQUENCE @startuml
			PARTICIPANT test
			PARTICIPANT test2
			test ->x test2
			PARTICIPANT "fo\n123l l" AS lol
			PARTICIPANT "fooLong" AS foo
			foo x--> lol
			foo x<--x lol
			foo <-x lol
			[x<- lol
			@enduml
		'''.parse
		assertEquals("test", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).userOne.name)
		assertEquals("test2", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(5) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(5) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(6) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(6) as UmlUse).userTwo.name)
		assertEquals("foo", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(7) as UmlUse).userOne.name)
		assertEquals("lol", ((heros.umlDiagrams.head as SequenceUml).umlElements.get(7) as UmlUse).userTwo.name)
	}

	
	@Test def void testRequest() {
	    val request = '''
	        SEQUENCE @startuml
	            PARTICIPANT A
	            PARTICIPANT B
	            A -> B : GET "/hello/${id}/foo"
	        @enduml
	    '''.parse

        assertNotNull((((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request))
	    assertEquals("GET", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).method)
	    assertEquals("/hello/${id}/foo", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).url)
	}

	@Test def void testRequestOneRequestParam() {
	    val request = '''
	        SEQUENCE @startuml
	            PARTICIPANT A
	            PARTICIPANT B
	            A -> B : GET "/hello/${id}/foo" (foo : "/bar")
	        @enduml
	    '''.parse

        assertNotNull((((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request))
	    assertEquals("GET", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).method)
	    assertEquals("/hello/${id}/foo", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).url)
	    assertEquals(1, (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.length)
	    assertEquals("foo", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.get(0).name)
	    assertEquals("/bar", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.get(0).value)
	}

	@Test def void testRequestMultipleRequestParam() {
	    val request = '''
	        SEQUENCE @startuml
	            PARTICIPANT A
	            PARTICIPANT B
	            A -> B : GET "/hello/${id}/foo" (foo : "/bar", far : "/cry")
	        @enduml
	    '''.parse

        assertNotNull((((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request))
	    assertEquals("GET", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).method)
	    assertEquals("/hello/${id}/foo", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).url)
	    assertEquals(2, (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.length)
	    assertEquals("foo", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.get(0).name)
	    assertEquals("/bar", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.get(0).value)
	    assertEquals("far", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.get(1).name)
        assertEquals("/cry", (((request.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Request).requestParam.get(1).value)
	}

	@Test def void testResponseOnlyResponseCodes() {
        val response = '''
            SEQUENCE @startuml
                PARTICIPANT A
                PARTICIPANT B
                A -> B : 200,300
            @enduml
        '''.parse

        assertNotNull((((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response))
        assertArrayEquals(#[200, 300], (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).code)
    }

    @Test def void testResponseOneExtractParam() {
        val response = '''
            SEQUENCE @startuml
                PARTICIPANT A
                PARTICIPANT B
                A -> B : 200,300 - (foo : "/bar")
            @enduml
        '''.parse

        assertNotNull((((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response))
        assertArrayEquals(#[200, 300], (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).code)
        assertEquals(1, (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.length)
        assertEquals("foo", (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.get(0).name)
        assertEquals("/bar", (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.get(0).value)
    }

    @Test def void testResponseMultipleExtractParams() {
        val response = '''
            SEQUENCE @startuml
                PARTICIPANT A
                PARTICIPANT B
                A -> B : 200,300 - (foo : "/bar", far : "/cry")
            @enduml
        '''.parse

        assertNotNull((((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response))
        assertArrayEquals(#[200, 300], (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).code)
        assertEquals(2, (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.length)
        assertEquals("foo", (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.get(0).name)
        assertEquals("/bar", (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.get(0).value)
        assertEquals("far", (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.get(1).name)
        assertEquals("/cry", (((response.umlDiagrams.head as SequenceUml).umlElements.get(2) as UmlUse).content as Response).extractParam.get(1).value)
    }
}
