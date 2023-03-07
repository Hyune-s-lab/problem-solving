package codewars.kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Two to One` {
    @Test
    fun test() {
        println("longest Fixed Tests")
        assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"))
        assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
        assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"))
    }
}

fun longest(s1: String, s2: String): String {
//    return (s1 + s2).toCharArray().distinct().sorted().joinToString("")
    return (s1 + s2).toSortedSet().joinToString("")
}
