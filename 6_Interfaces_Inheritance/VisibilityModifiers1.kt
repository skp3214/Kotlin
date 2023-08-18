class SomeClass{
    private val privateproperty="ABC"
    protected fun protectedFunction(){
        println("protected function")
    }
    fun publicFunction(){
        println("Public Function")
    }
    internal val internalProperty="ABC"

    fun test(){
        println(privateproperty) 
        protectedFunction()
        publicFunction()
        println(internalProperty)
    }
}

fun main() {
    // val obj=SomeClass()
    // obj.privateproperty 
}
// private cannot be access outside the class
// Test function is member of same class so it can acess all the modifier. 
