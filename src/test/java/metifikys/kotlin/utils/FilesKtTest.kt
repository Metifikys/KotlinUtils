package metifikys.kotlin.utils

import metifikys.kotlin.utils.extends.getFileFromResources
import metifikys.kotlin.utils.extends.isEmpty
import metifikys.kotlin.utils.extends.notEmpty
import org.junit.jupiter.api.Assertions.*

internal class FilesKtTest {

    private val emptyFile = "FileTest/EmptyFile.txt".getFileFromResources()
    private val notEmpty = "FileTest/NotEmptyFile.txt".getFileFromResources()


    @org.junit.jupiter.api.Test
    fun isEmpty() {
        assertTrue(emptyFile.isEmpty())
        assertFalse(emptyFile.notEmpty())
    }

    @org.junit.jupiter.api.Test
    fun notEmpty() {
        assertTrue(notEmpty.notEmpty())
        assertFalse(notEmpty.isEmpty())
    }
}