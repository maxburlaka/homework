package block4.repetition_operators

fun main () {
    var a1 = 1
    var a2 = 2
    var a3 = 3

    for (i in 0..5){

        val s = a3 + a2 - 2 * a1
        val a = a3
        a1 = a2
        a2 = a
        println(s)
    }
}