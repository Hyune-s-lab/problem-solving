package codewars.kyu6

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class `Persistent Bugger` {
    @Test
    fun `Basic Tests`() {
        persistence(39) shouldBe 3
        persistence(10) shouldBe 1
        persistence(4) shouldBe 0
        persistence(25) shouldBe 2
        persistence(999) shouldBe 4
    }
}

fun persistence(num: Int): Int {
    var current = num
    var count = 0

    while (current >= 10) {
        current = multiplyEachDigit(current)
        count++
    }

    return count
}

fun multiplyEachDigit(num: Int): Int {
    var current = num
    var result = 1

    while (current >= 10) {
        result *= current % 10
        current /= 10
    }

    return result * current
}
