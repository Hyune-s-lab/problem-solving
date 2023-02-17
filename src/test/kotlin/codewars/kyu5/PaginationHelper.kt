package codewars.kyu5

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PaginationHelperTest {
    @Test
    fun testItemCount() {
        val helper = PaginationHelper<Int>(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11), 3)
        assertEquals(11, helper.itemCount, "itemCount is returning incorrect value")
    }

    @Test
    fun testPageCount() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f'), 4)
        assertEquals(2, helper.pageCount, "pageCount is returning incorrect value")
        helper.pageCount shouldBe 2
        helper.itemCount shouldBe 6
        helper.pageItemCount(0) shouldBe 4
        helper.pageItemCount(1) shouldBe 2
        helper.pageItemCount(2) shouldBe -1

        helper.pageIndex(6) shouldBe -1
        helper.pageIndex(5) shouldBe 1
        helper.pageIndex(4) shouldBe 1
        helper.pageIndex(3) shouldBe 0
        helper.pageIndex(2) shouldBe 0
        helper.pageIndex(1) shouldBe 0
        helper.pageIndex(0) shouldBe 0
        helper.pageIndex(20) shouldBe -1
        helper.pageIndex(-10) shouldBe -1
    }
}

class PaginationHelper<T>(collection: List<T>, private val itemsPerPage: Int) {
    /**
     * returns the number of items within the entire collection
     */
    val itemCount: Int = collection.size

    /**
     * returns the number of pages
     */
    val pageCount: Int = itemCount / itemsPerPage + 1

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    fun pageItemCount(pageIndex: Int): Int =
        when {
            pageIndex == pageCount - 1 -> itemCount - (pageCount - 1) * itemsPerPage
            pageIndex >= pageCount -> -1
            else -> itemsPerPage
        }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int {
        return if (itemIndex in 0 until itemCount) itemIndex / itemsPerPage
        else -1
    }
}
