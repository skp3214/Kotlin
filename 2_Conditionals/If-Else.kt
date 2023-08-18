//

fun main() {
    val finishedHomeWork = true
    if (finishedHomeWork) {
        println("can go to the cinema")
    } else {
        println("go home and study more")
    }

    // it can be written as like this also

    if (finishedHomeWork) println("can go to the cinema") else println("go home and study more")

    // if else can be used as an expression. In other words,
    // to return a value that can be stored in a variable.file

    val haveSomeExtraMoney = true
    val tip =
            if (haveSomeExtraMoney) {
                10.0
            } else {
                0.0
            }

    println(tip)

    val haveSomeExtraMoney2 = true
    val tip2: Double =
            if (haveSomeExtraMoney2) {
                10.0
            } else {
                0.0
            }

    println(tip2)
}
