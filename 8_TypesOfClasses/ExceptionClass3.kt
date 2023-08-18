// finally block executed whether try-catch block have exceptions or not. 

// below is the example of same situation. 

fun noExceptionFunc(){
    println("This section will be printed because it has no exception. ")

}

fun main() {
    try{
        noExceptionFunc()
    }
    finally{
        println("This section is also printed")
    }
}