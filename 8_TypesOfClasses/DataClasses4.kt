// Finally data classes have a copy method, that creates a copy of an object.It alllows 
// to create new objects from existing ones

data class Tiger(val name:String, val age:Int)

fun main() {
    val tigerYoung=Tiger("Shershah", 12)
    val tigerOld=tigerYoung.copy(age=50)
    print(tigerOld) // Tiger(name=Shershaah,age=50)

    // you can change name also 😂
}