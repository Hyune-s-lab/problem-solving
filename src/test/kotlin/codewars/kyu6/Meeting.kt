package codewars.kyu6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Meeting {
    @Test
    fun testFixed() {
        assertEquals(
            "(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)",
            meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn")
        )
        assertEquals(
            "(BELL, MEGAN)(CORNWELL, AMBER)(DORNY, JAMES)(DORRIES, PAUL)(GATES, JOHN)(KERN, ANN)(KORN, ANNA)(META, ALEX)(RUSSEL, ELIZABETH)(STEVE, LEWIS)(WAHL, MICHAEL)",
            meeting("John:Gates;Michael:Wahl;Megan:Bell;Paul:Dorries;James:Dorny;Lewis:Steve;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell")
        )
        assertEquals(
            "(ARNO, ALEX)(ARNO, HALEY)(BELL, SARAH)(CORNWELL, ALISSA)(DORNY, PAUL)(DORRIES, ANDREW)(KERN, ANN)(KERN, MADISON)",
            meeting("Alex:Arno;Alissa:Cornwell;Sarah:Bell;Andrew:Dorries;Ann:Kern;Haley:Arno;Paul:Dorny;Madison:Kern")
        )
    }
}

//fun meeting(s: String): String {
//    return s.split(";")
//        .map { it.uppercase().split(":").reversed() }
//        .sortedWith(compareBy({ it[0] }, { it[1] }))
//        .joinToString("") { "(${it[0]}, ${it[1]})" }
//}

fun meeting(s: String) = s.uppercase()
    .split(";")
    .map { it.split(":") }
    .map { "(${it[1]}, ${it[0]})" }
    .sorted()
    .joinToString("")
