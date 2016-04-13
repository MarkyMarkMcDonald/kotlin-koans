package i_introduction._8_Smart_Casts

import org.junit.Assert.assertEquals
import org.junit.Test

class _08_Smart_Casts {

    @Test fun testObjectTypeSwitch() {
        assertEquals(33, retrieveId(SavedItem(33)))
        assertEquals(null, retrieveId(UnsavedItem()))
    }

    private fun retrieveId(item: Item): Long? {
//        when (item) {
//            is UnsavedItem -> throw UnsupportedOperationException("not implemented")
//        }
        return 0
    }
}

open class Item(val id: Long?)

class SavedItem(id: Long) : Item(id)
class UnsavedItem() : Item(id=null)