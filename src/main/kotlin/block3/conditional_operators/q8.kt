package block3.conditional_operators

fun main () {
    val a = 1
    val b = 2
    val c = 3

    if (c < b && c > a){
        println(c)
    }
    else if(a > b && a < c ) {
        println(a)
    }
    else{
        println(b)
    }
}