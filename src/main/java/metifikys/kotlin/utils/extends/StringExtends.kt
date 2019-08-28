package metifikys.kotlin.utils.extends

import java.io.File

fun String.getFileFromResources() : File {
    val classLoader = this::javaClass.javaClass.classLoader
    return classLoader.getResource(this).path.toFile()
}

fun String.toFile() = File(this)
