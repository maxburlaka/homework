package block3.conditional_operators

fun main() {
    val r = 2000

    if(r % 4 == 0 && r % 100 == 0 && r % 400 > 0){
        println(365)
    }
    else{
        println(366)
    }
}