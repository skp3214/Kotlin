// A boolean has two possible values. true and false, and can be used to
// tell users whether something is true or not.

fun main() {
    var cookiesPolicyAccepted:Boolean=true;
    println("Cookies policy accepted? $cookiesPolicyAccepted")

    // Just like you can perform operations on numbers, you can also perform
    // operations on Boolean values.

    // The 'and' operator(&&)

    val finishedHomework=false 
    val cleanedRoom=true
    val canPlayGames=finishedHomework && cleanedRoom
    println(canPlayGames)

    // The 'or' operator (||)

    var carCleaned=false
    val grassCut=true
    val canGotToCinema=carCleaned || grassCut
    println(canGotToCinema)

    // The 'not' operator (!)

    var isAmazing=true
    println(!isAmazing)

    


}