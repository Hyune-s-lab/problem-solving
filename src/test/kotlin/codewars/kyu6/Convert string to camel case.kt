package codewars.kyu6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("", toCamelCase(""))
        assertEquals("a", toCamelCase("a"))
        assertEquals("theStealthWarrior", toCamelCase("the_stealth_warrior"))
        assertEquals("TheStealthWarrior", toCamelCase("The-Stealth-Warrior"))
        assertEquals("ABC", toCamelCase("A-B-C"))
    }
}

fun toCamelCase(str: String): String {
//    val split = str.split(Regex("[-_]"))
//    return split[0] + split.drop(1).joinToString("") { it[0].uppercase() + it.substring(1, it.length) }

    return str.split(Regex("[-_]")).reduce { acc: String, s: String -> acc + s.replaceFirstChar { it.uppercase() } }
}
