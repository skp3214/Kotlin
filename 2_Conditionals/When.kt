

import kotlin.text.toInt// When statement is an alterntive to if-else-if.

fun main() {

    // Using when as an Expression

    println("Is it going to rain? ")
    val probability = 70
    when {
        probability < 40 -> {
            print("It will not rain")
        }
        probability <= 80 -> {
            print("it might rain")
        }
        else -> print("I don't know.")
    }

    // It can be also written as without brackets

    /**
     * when{
     * ```
     *    probability<40->println("It will not rain")
     *    probability<=80->println("It Might rain")
     *    else->println("I don't know")
     * ```
     * }
     */

    
     // When with a value

     val number= readLine()
     val number2=number?.toInt()?:0
     
     when(number2){
         1-> println("One")
         2-> println("two")
         3->println("3")
         else-> println("Nothing")
        }
        
    val number3=number?.toInt()?:0

     // Using range in when statements

     when(number3){
        1-> println("one")
        in 5..9->println("between 5 and 9")
        !in 5..9->println("not in between 5 and 9")
        else->println("hello")

     }

    
     
}
