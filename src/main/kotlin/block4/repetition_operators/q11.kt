package block4.repetition_operators

fun main() {
    var a = 4056
    var b = 2044

    while (a > 0 && b > 0){
        if (a >= b){
            a = a % b
        }
        else{
            b = b % a
        }
        println(b + a)
    }
}