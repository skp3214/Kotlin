class OtherClass{
    private val privateproperty="ABC"
    protected fun protectedFunction(){
        println("protected function")
    }
    fun publicFunction(){
        println("Public Function")
    }
    internal val internalProperty="ABC"

    
}

fun otherTest(){
    // val obj=OtherClass()
    // obj.protectedFunction() not possible
    // only public and internal can be access outside the class
} 

fun main() {
    
}
