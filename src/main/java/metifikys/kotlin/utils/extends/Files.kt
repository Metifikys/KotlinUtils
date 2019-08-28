package metifikys.kotlin.utils.extends

import java.io.File

fun File.isEmpty() = this.length() == 0L

fun File.notEmpty() = this.length() > 0L

fun String.getFileFromResources() : File {
    return File(this::javaClass.javaClass.classLoader.getResource(this).path)
}