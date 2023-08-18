
open class Cow(open val name:String) 
// Class without body exist. 
 class Jersey(override val name:String):Cow(name)

 fun main() {
    val Jer=Jersey("Maya")
    println(Jer.name)


 }
