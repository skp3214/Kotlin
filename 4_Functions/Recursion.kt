
fun factorial(number:Int):Int{
    if(number<=1){
        return 1
    }
    return factorial(number-1)*number
}

fun main() {
    println("Factorial of number 5 is ${factorial(5)}")
    println("Factorial of number 6 is ${factorial(6)}")
    println("Factorial of number 7 is ${factorial(7)}")
}