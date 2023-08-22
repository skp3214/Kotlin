fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")

    val squaredNumbers = numbers.map { it * it }
    println("Squared numbers: $squaredNumbers")

    val sum = numbers.reduce { acc, number -> acc + number }
    println("Sum of numbers: $sum")
}

//Higher-order functions are functions that can take other functions as parameters or return functions as results. 
//In this example, filter, map, and reduce are higher-order functions because they take lambda expressions as arguments to customize their behavior.