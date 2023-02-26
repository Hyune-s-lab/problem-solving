package codewars.kyu5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Tricky Kotlin #7 Do multiple replacement` {
    @Test
    fun exampleTests() {
        assertEquals("You {{need}} <extra> time ( or money )", f("You }}need{{ >extra< time ) or money ("))
        assertEquals("<br/>", f(">br/<"))
    }
}

fun f(s: String): String {
    return s.map { "()<>{}".zip(")(><}{").toMap()[it] ?: it }
        .joinToString("")
}
