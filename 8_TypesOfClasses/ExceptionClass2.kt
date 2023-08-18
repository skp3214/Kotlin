// Finally Block

// it is used to specify a block of code that should always be
// invoked, even if an exception occurs. 

fun otherFunction(){
    throw Throwable("SomeError")
}

fun main() {
    try{
        otherFunction()
        println("try section will not printed because it is having an exceptio")
    }
    finally{
        println("Finally block was called. ")
    }

    
}

