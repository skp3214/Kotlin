// Enum class can also have a constructor. It looks just like constructor classes,
// but when it is defined each value need to call it. 

enum class PizzaSize(val sizeInCm:Int){
    SMALL (10),MEDIUM(25) ,LARGE(38)
}

fun printSize(pizzaSize:PizzaSize){
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")

}

fun main() {

    printSize(PizzaSize.SMALL)
    
}