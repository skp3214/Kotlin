// // Abstract classes
// When you use the abstract keyword before a class definition, you make this class abstract. Abstract classes can be thought of as a hybrid of an open class and an interface. There are two main consequences of making a class abstract:

// Abstract classes can have abstract methods or properties. Such elements are marked with an abstract modifier, and they do not have a body. They are just definitions, similar to those in interfaces, that need to be overridden in subclasses.  

// Abstract classes cannot be used to create objects. However, you can inherit subclasses from them. This is a result of the first consequence - you cannot create objects with abstract methods or properties. Those need to be overridden.


abstract class SomeAbstractClass{
    abstract fun abstractMethod()
    fun callAbstractTwice(){
        abstractMethod()
        abstractMethod()
    }
}

class SomeRegularClass: SomeAbstractClass(){
    override fun abstractMethod(){
        println("Calling abstract methodd")
    }
}

fun main() {
    val regular=SomeRegularClass()
    regular.abstractMethod()
    regular.callAbstractTwice();
}