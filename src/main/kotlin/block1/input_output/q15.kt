package block1.input_output

fun main(){
    val a = 15
    val b = 13
    val c = 23

    if (a > c && b > c){
        val ac = a - c
        val bc = b - c
        println(ac)
        println(bc)
    }
    else{
        val ac = c - a
        val bc = c - b
        println(ac)
        println(bc)
    }
}