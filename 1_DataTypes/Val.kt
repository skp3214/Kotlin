// Val is an abbreviation of 'value'. You use this modifier to
// specify variables that cannot be reassigned. In other words, 
// code will not start if you try to assign a new value.

fun main() {
    val name="Sachin"
    // name="abhishek"  ERROR! val cannot be reassigned
    println("Name : $name")
}