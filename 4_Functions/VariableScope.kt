
// Variable scope

fun f1(){
    val a = 20
    println(a)    // cannot use b here
}

fun f2(){
    val b=10
    println(b) // cannot use a here
}


fun main() {
    f1()
    f2()

    // here neither you can use variable a nor b.

    // above were the examples of local variables.
}