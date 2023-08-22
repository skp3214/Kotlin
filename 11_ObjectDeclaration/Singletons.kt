// While multiple instances are important, there are sometimes concepts that you will need to represent in code where only one
// instance should exist. This is the purpose of a singleton. 
// Singletons are a code design pattern whereby only one instance of 
// a type of object can exist. 

import java.util.*;


object Company{
    var companyName:String="Little Lemon"
    var yearOpened:Int=2019
    fun getTotalYearsOpen():Int{
        return Calendar.getInstance().get(Calendar.YEAR)-yearOpened;
    }
}

fun main() {
    println(Company.getTotalYearsOpen())
}