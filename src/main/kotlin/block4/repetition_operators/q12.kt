package block4.repetition_operators

fun main() {
    val n = 55
    var f1= 1
    var f2 = 2

    while (n > f2){
        var f = f2
        f2 = f1 + f2
        f1 = f

        if (n == f2){

            println("True")
        }
        else{
            println("False")
        }
    }
}