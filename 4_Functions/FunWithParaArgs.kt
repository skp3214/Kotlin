// Parameters: value defined as part of function. 
// Argument: actual value passed during function call.

fun printName(name:String){
    println("Hello "+name)
}


fun printNum(num:Int){
    println("The number is $num")
}

fun main() {

    printName("Sachin")
    printNum(5)
    
}