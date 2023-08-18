data class Monkey(val name:String)


fun main() {
    val monkey1 = Monkey("Bruce")
    val monkey2 = Monkey("Bruce")
    val monkey3 = Monkey("Harry")

    println(monkey1==monkey2)  // true
    println(monkey1==monkey1)  // true
    println(monkey1==monkey3)  // false
    // false because the constructor property has different name. 
    // true because the constructor property has same value

    // println(fish1==monkey1) // false

    println(monkey1)  // Monkey(name=Bruce)
}