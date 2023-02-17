package codewars.kyu7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Parts of a list` {
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        println("Fixed Tests partlist")

        val s1 = arrayOf("cdIw", "tzIy", "xDu", "rThG")
        val a1 = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]"
        testing(partlist(s1).contentDeepToString(), a1)

        val s2 = arrayOf("I", "wish", "I", "hadn't", "come")
        val a2 = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]"
        testing(partlist(s2).contentDeepToString(), a2)
    }
}

fun partlist(arr: Array<String>): Array<Array<String>> {
    return (0..arr.size - 2).map {
        arrayOf(
            arr.copyOfRange(0, it + 1).joinToString(" "),
            arr.copyOfRange(it + 1, arr.size).joinToString(" ")
        )
    }.toTypedArray()
}
