// Data classes can be destructured, which means reading values
// from this class and assigning them to variables. 

//  For instance, if you place age at the position of name, and name at the position of age, then you will have age in a variable called name, and name in the variable called age


data class Boy(val name:String, val age:Int)

fun main() {
    val boy=Boy("Sachin", 22)
    val(age,name)=boy // this is called destructuring
    println(age) // sachin
    println(name) // 22
}