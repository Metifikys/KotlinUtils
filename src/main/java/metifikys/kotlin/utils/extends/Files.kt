package metifikys.kotlin.utils.extends

import java.io.File

fun File.isEmpty(): Boolean {
    return this.length() == 0L
}
fun File.notEmpty(): Boolean {
    return this.length() > 0L
}

fun String.getFileFromResources() : File {
    return File(this::javaClass.javaClass.classLoader.getResource(this).path)
}