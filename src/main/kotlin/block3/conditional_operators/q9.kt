package block3.conditional_operators

fun main() {

    val a = 13
    val b = 22
    val c = 3

    if (a < b && a < c){

        val bc = b + c
        println(bc)
    }
    else if(b < a && b < c){

        val ac = a + c
        println(ac)
    }
    else {
        val ab = a + b
        println(ab)
    }
}