package block3.conditional_operators

fun main() {
    var n = 0

    if (n > 0){

        n = n + 1
        println(n)
    }
    else if (n == 0){
        n = 10
        println(n)
    }
    else {
        n = n - 2
        println(n)
    }
}