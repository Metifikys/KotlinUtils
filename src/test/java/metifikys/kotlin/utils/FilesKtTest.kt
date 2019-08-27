package metifikys.kotlin.utils

import metifikys.kotlin.utils.extends.getFileFromResources
import metifikys.kotlin.utils.extends.isEmpty
import metifikys.kotlin.utils.extends.notEmpty
import org.junit.jupiter.api.Assertions.*

internal class FilesKtTest {

    @org.junit.jupiter.api.Test
    fun isEmpty() {
        val empty = "FileTest/EmptyFile.txt".getFileFromResources().isEmpty()
        assertTrue(empty)
    }

    @org.junit.jupiter.api.Test
    fun notEmpty() {
        val empty = "FileTest/NotEmtyFile.txt".getFileFromResources().notEmpty()
        assertTrue(empty)
    }
}