package codewars.kyu8

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `String repeat` {
    @Test
    fun test4a() {
        assertEquals("aaaa", repeatStr(4, "a"))
    }

    @Test
    fun test3Hello() {
        assertEquals("HelloHelloHello", repeatStr(3, "Hello"))
    }

    @Test
    fun test5empty() {
        assertEquals("", repeatStr(5, ""))
    }

    @Test
    fun test0kata() {
        assertEquals("", repeatStr(0, "kata"))
    }
}

fun repeatStr(r: Int, str: String): String {
//    return (1..r).joinToString("") { str }
    return str.repeat(r)
}
