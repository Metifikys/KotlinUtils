package metifikys.kotlin.utils

import metifikys.kotlin.utils.extends.printEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class SequenceTest {

    @org.junit.jupiter.api.Test
    fun printEach() {

        val testList = listOf("Test123", "Start", "list")
        val expected = testList.joinToString(System.lineSeparator()) + System.lineSeparator()


        var buffer = ByteArrayOutputStream()
        PrintStream(buffer, true, "UTF-8").use {
            testList.asSequence().printEach(it)
        }

        var actual = buffer.toString("UTF-8")
        assertEquals(expected, actual)

        val out = System.out
        buffer = ByteArrayOutputStream()
        System.setOut(PrintStream(buffer, true, "UTF-8"))
        testList.asSequence().printEach()

        actual = buffer.toString("UTF-8")
        assertEquals(expected, actual)
        System.setOut(out)

    }

}