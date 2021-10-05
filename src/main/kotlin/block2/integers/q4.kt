package block2.integers

fun main() {
    val a = 199 //не більше 200
    val a1 = a / 100
    val a2 = (a % 10) / 10
    val a3 = a % 10

    val a5 = a2 * 100 + a3 * 10 + a1 * 1
    val a6 = (a5 % 10) + 10 + a3 - 1

    println(a6)
}