package block3.conditional_operators

fun main(){

    val a = 10022
    val b = 12394
    val c = 12755

    if (a < b && a < c){
        println(a)
    }
    else if(b < c){
        println(b)
    }
    else {
        println(c)
    }

}