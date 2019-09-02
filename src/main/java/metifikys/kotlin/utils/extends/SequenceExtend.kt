package metifikys.kotlin.utils.extends

import java.io.PrintStream

fun <T> Sequence<T>.printEach(out: PrintStream = System.out) {
    for (element in this) out.println(element)
}