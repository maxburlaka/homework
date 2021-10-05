package block1.input_output

import java.lang.Math.pow

fun main() {
    val x = 5

    val y = 3 * pow(x.toDouble(), 6.0) - 6 * (x * x) - 7
    println(y)
}