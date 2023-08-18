

fun triangleArea(width:Double, height: Double):Double{
    return width*height/2

    // println("Hello") after return, code will not reach here
    // you have to print it before return statement.
    
}

fun main() {
    val area=triangleArea(9.5, 5.6)
    println("The Area of the Triangle is $area")
    //Another way to write it in Kotlin
    println(triangleArea(5.5, 9.8))
}


// fun functionName(parameter:dataType, parameter:dataType): retun type{     }
// fun triangleArea(width: Double, height: Double): Double{      }