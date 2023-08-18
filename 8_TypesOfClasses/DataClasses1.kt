
// data classes have word data before class
// below is the example of class without data
// In dataclasses2.kt you will see the difference after using word data

class Fish(val name:String)



fun main() {

    val fish1 = Fish("Tuna")
    val fish2 = Fish("Tuna")
    println(fish1==fish2)  // false
    println(fish1==fish1)  // true

    println(fish1) // Fish@30f39991

}
