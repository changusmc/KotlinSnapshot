package com.karumi.androidconsumer

import com.karumi.kotlinsnapshot.KotlinSnapshot
import org.junit.Assert
import org.junit.Test

class ExampleUiTest {
    @Test
    fun can_resolve_KotlinSnapshot() {
        val snapshot = KotlinSnapshot()
        Assert.assertNotNull(snapshot)
    }
}
