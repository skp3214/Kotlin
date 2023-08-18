// Defining and throwing exceptions 
// ------------------------------
// The following code shows how to define an exception class, throw it in a method call, catch the thrown object.
// The throw keyword is used to create an exception. An exception can be thrown by using the following syntax:
// The throw statement is used to raise an exception. It takes a single argument, which can be any value or expression that evaluates to the

class MyError: Throwable("Some message")

fun someFunction(){
    throw MyError()
    
}

fun main() {
    try{
        someFunction()
        println("Will not be printed")

    }catch(e:Throwable){
        println("Caught $e")
    }
}