package i_introduction._11_SAM_Conversions

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class _11_SAM_Conversions {

    val greaterThan = {x: Int, y: Int -> throw UnsupportedOperationException("TODO") }

    @Test fun testInterop() {
        assertEquals(true, greaterThan(5,4))

//        assertEquals(listOf(5, 3, 1), sortWith(listOf(3,5,1), null))
    }

    fun sortWith(things: List<Int>, comparator: (Int, Int)->Int) {
        Collections.sort(things, comparator)
    }
}
