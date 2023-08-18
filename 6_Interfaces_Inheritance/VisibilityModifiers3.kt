open class ParentClass{
    private val privateproperty="ABC"
    protected fun protectedFunction(){
        println("protected function")
    }
    fun publicFunction(){
        println("Public Function")
    }
    internal val internalProperty="ABC"
}

// protected and internal modifiers are used in only open and abstract classes. 
// only open class can be inherited and overriden in other classes. 
// so in below example you can acess the protected modifier because it in inherited
// by other class and it is open also

class ChildClass:ParentClass(){
    fun test(){
        // println(privateproperty)
        //Error
        println(protectedFunction())
        println(internalProperty)
        // as we know public and internal are accessible out the class

    }
}

fun main() {
    var child=ChildClass()
    child.test()
}