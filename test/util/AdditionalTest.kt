package util

import i_introduction._7_Nullable_Types._07_Nullable_Types
import i_introduction._8_Smart_Casts._08_Smart_Casts
import ii_collections._24_Extensions_On_Collections
import org.junit.Assert.assertTrue
import org.junit.Test

class AdditionalTest {
    @Test fun test() {
        invokeTests(
                { _07_Nullable_Types().middleNameIsOptional() },
                { _24_Extensions_On_Collections().testCollectionOfOneElement() }
        )
        assertTrue("${JavaCode.set}", JavaCode.set.isEmpty())
    }

    private fun invokeTests(vararg tests: () -> Unit) {
        for (test in tests) {
            try {
                test()
            }
            catch (e: NotImplementedException) {}
        }
    }
}

