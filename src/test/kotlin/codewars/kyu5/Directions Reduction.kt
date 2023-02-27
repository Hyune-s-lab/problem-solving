package codewars.kyu5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Directions Reduction` {
    private fun testing(arr: Array<String>, expect: Array<String>) {
        val actual: Array<String> = DirReduction.dirReduc(arr)
        assertEquals(expect.contentDeepToString(), actual.contentDeepToString())
    }

    @Test
    fun basicTests() {
        testing(arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"), arrayOf("WEST"))
        testing(arrayOf("NORTH", "WEST", "SOUTH", "EAST"), arrayOf("NORTH", "WEST", "SOUTH", "EAST"))
        testing(arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH"), arrayOf("NORTH"))
        testing(
            arrayOf("NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH"),
            arrayOf("NORTH", "EAST")
        )
        testing(arrayOf(""), arrayOf(""))
    }
}

object DirReduction {
    fun dirReduc(arr: Array<String>): Array<String> {
        var recursive = Pair(true, arr)
        while (recursive.first) {
            recursive = recursive(recursive.second)
        }
        return recursive.second
    }

    private fun recursive(arr: Array<String>): Pair<Boolean, Array<String>> {
        var retry = false

        (0 until arr.size - 1).forEach {
            if (arr[it] == "NORTH" && arr[it + 1] == "SOUTH") {
                arr[it] = ""
                arr[it + 1] = ""
                retry = true
            }

            if (arr[it] == "SOUTH" && arr[it + 1] == "NORTH") {
                arr[it] = ""
                arr[it + 1] = ""
                retry = true
            }

            if (arr[it] == "EAST" && arr[it + 1] == "WEST") {
                arr[it] = ""
                arr[it + 1] = ""
                retry = true
            }

            if (arr[it] == "WEST" && arr[it + 1] == "EAST") {
                arr[it] = ""
                arr[it + 1] = ""
                retry = true
            }
        }

        return Pair(retry, arr.filter { it.isNotEmpty() }.toTypedArray())
    }
}
