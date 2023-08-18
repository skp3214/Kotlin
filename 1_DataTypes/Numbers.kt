// In Kotlin, these are the four basic types reperesenting numbers.
// Int is the default integer number representation when a whole number (such as 20) is specified.

// Long is an integer representation supporting larger numbers. You create it by using an  L suffix.

// Double is the default decimal number representation. It holds values up to 15 or 16 decimal places.

// Float is an integer representation supporting smaller decimal numbers. It holds values up to 7 or 8 decimal places. You create it using the F or f suffix.


fun main() {
    var int=10
    println(int)

    var long = -34L
    println(long)

    var double=3.4
    println(double)

    var float=3.4f
    println(float)


    // You can transform them also

    var I=long.toInt()
    print("I: $I")

    var L=int.toLong()
    print("\nL:$L ")

    var F=double.toFloat()
    print("\nF :$F \n")

    var D=int.toDouble()
    print("\nD:$D\n")


    val a = 1 + 2L // the type of a is Long 
    println(a)
    val b = 1 + 2.0 // the type of b is Double 
    println(b)
    val c = 1.0F + 2 // the type of c is Float
    println(c) 
    val d = 1.0F + 2.0 // the type of c is Double
    println(d)


}