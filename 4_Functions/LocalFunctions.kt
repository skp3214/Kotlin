// Just as local variables can be defined, so too can local functions.

fun b(){
    println("fun b")
    // b cannot use funtion a
}

fun main() {
    
   fun a(){
    b()
    println("function a")
    c()

    // function a can use both function b and c.

   }
   a()
   b()
   c()
}

fun c(){
    println("fun c")

    // cannot use function a
}