package block1.input_output

import java.lang.Math.pow

fun main() {
    val x = 2

    val y = 4 * pow((x-3).toDouble(), 6.0) - 7 * pow((x-3).toDouble(), 3.0) + 2
    println(y)
}