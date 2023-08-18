// if-else-if is a popular structure in many langauges
// but not in kotlin. This is because there is a better
// way of doing this using when expression, but it's good to know how to
// use if-else-if in case you ever need it.

fun main() {

    println("Is it going to rain? ")

    val probability=70

    if(probability>50)
    print("Yes")
    else if(probability==70)
    print("Maybe")
    else
    print("No")

}