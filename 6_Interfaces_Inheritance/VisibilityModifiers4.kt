open class OtherParent{
    private val privateproperty="ABC"
    protected fun protectedFunction(){
        println("protected function")
    }
    fun publicFunction(){
        println("Public Function")
    }
    internal val internalProperty="ABC"
}
class OtherChild:ParentClass()

fun test(){
    val o=ChildClass()
    // println(o.privateproperty) not possible
    // o.protectedFunction() not possible because it can be used only if it is inherited.
    o.publicFunction()
    // rest you know
}

fun main() {
    test()
}