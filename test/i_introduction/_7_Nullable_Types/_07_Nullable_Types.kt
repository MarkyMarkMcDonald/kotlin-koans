package i_introduction._7_Nullable_Types

import i_introduction._6_Data_Classes.Person
import org.junit.Assert.assertEquals
import org.junit.Test

class _07_Nullable_Types {


    @Test fun middleNameIsOptional() {
//         val alice = Person(name = "Alice", middleName = null, age = 29)
//         val bob = Person(name="Bob", middleName="Norman", age=29)
//
//         assertEquals(alice.middleName, null)
//         assertEquals(bob.middleName, "Norman")
//
//         assertEquals("N", middleInitial(bob))
//         assertEquals(null, middleInitial(alice))
    }

    fun middleInitial(person: Person): String? {
        // use substring!
        return ""
    }

}