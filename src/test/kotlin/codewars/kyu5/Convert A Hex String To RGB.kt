package codewars.kyu5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Convert A Hex String To RGB` {
    @Test
    fun testFixed() {
        assertEquals(RGB(r = 255, g = 153, b = 51), hexStringToRGB("#FF9933"))
        assertEquals(RGB(r = 190, g = 173, b = 237), hexStringToRGB("#beaded"))
        assertEquals(RGB(r = 0, g = 0, b = 0), hexStringToRGB("#000000"))
        assertEquals(RGB(r = 17, g = 17, b = 17), hexStringToRGB("#111111"))
        assertEquals(RGB(r = 250, g = 52, b = 86), hexStringToRGB("#Fa3456"))
    }
}

// you have preloaded
// data class RGB(val r: Int, val g: Int, val b: Int)
//fun hexStringToRGB(hexString: String): RGB {
//    return RGB(
//        hexString.substring(1, 3).toLong(16).toInt(),
//        hexString.substring(3, 5).toLong(16).toInt(),
//        hexString.substring(5, 7).toLong(16).toInt()
//    )
//}

fun hexStringToRGB(hexString: String): RGB {
    return hexString.drop(1).chunked(2) { "$it".toInt(16) }.let { RGB(it[0], it[1], it[2]) }
}

data class RGB(val r: Int, val g: Int, val b: Int)
