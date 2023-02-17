package codewars.kyu6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Stop gninnipS My sdroW!` {
    @Test
    fun test1() {
        assertEquals("emocleW", spinWords("Welcome"))
    }

    @Test
    fun test2() {
        assertEquals("Hey wollef sroirraw", spinWords("Hey fellow warriors"))
    }

    @Test
    fun test3() {
        assertEquals("This is a test", spinWords("This is a test"))
    }

    @Test
    fun test4() {
        assertEquals("This is rehtona test", spinWords("This is another test"))
    }

    @Test
    fun test5() {
        assertEquals("You are tsomla to the last test", spinWords("You are almost to the last test"))
    }

    @Test
    fun test6() {
        assertEquals("Just gniddik ereht is llits one more", spinWords("Just kidding there is still one more"))
    }
}

fun spinWords(sentence: String): String =
    sentence.split(" ")
        .joinToString(" ") {
            if (it.length >= 5) {
                it.reversed()
            } else {
                it
            }
        }
