fun main() {
    println("Enter a character or number:")
    val input = readLine()

    if (input != null && input.isNotEmpty()) {
        if (input.length == 1) {
            val char = input[0]

            if (char in 'a'..'z' || char in 'A'..'Z') {
                println("Input is an alphabet.")
            } else if (char.isDigit()) {
                println("Input is an integer.")
            } else {
                println("Input is neither an alphabet nor an integer.")
            }
        } else {
            println("Input is neither an alphabet nor an integer.")
        }
    } else {
        println("Input is empty.")
    }
}
