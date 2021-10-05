package block3.conditional_operators

fun main() {
    val x  = 3

    if (x <= 0){
        val f = -x
        println(f)
    }else if(x >= 2){
        val f = 4
        println(f)
    }
    else {
        val f = x * x
        println(f)
    }
}