package block1.input_output

import kotlin.math.sqrt

fun main() {
    val x1 = 10f
    val x2 = 17f
    val y1 = 15f
    val y2 = 20f

    val L = sqrt((x2 - x1) * (y2 - y1))
    println(L)
}