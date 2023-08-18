// Interface and Polymorphism Example

interface Animal {
    val breed: String
    fun pet()
}

class Cat(val name: String, override val breed: String) : Animal {
    override fun pet() {
        println("Meow")
    }
}

class Dog(val name: String, override val breed: String) : Animal {
    override fun pet() {
        println("Waff")
    }
}

fun pet(animal: Animal) {
    animal.pet()
}

fun checkIsDog(animal: Animal) {
    if (animal is Dog) {
        println("It is a dog")
    } else {
        println("it is a cat")
    }
}

fun main() {
    pet(Cat("Jake", "Munkin")) // object of cat class is passed.
    pet(Dog("Rocky", "Bulldog")) // object of dog class is passed.
    checkIsDog(Cat("Jake", "Munkin")) 
    checkIsDog(Dog("Rocky", "Bulldog")) 
}
