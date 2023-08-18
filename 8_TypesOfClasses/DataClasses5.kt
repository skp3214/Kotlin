// in some cases you need to reperesent a apair of value. 
// for that, a class you can read those value using first and second properties. 
// another class is triplet. 
// it has three property named first ,second & third. 

fun main() {
    val pair = Pair("first", 22)
    println(pair.first + " : "+pair.second ) // first:  22
    var triple=Triple("Sachin","Prajapati", 22)
    println(triple.first)
    println(triple.second)
    println(triple.third)
}
