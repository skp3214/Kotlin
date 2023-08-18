// Important exceptions. 

// IllegalArgumentException- used when an argument has an incorrect value. 
// for example, when you expect your argument value to be bigger than 0, and it is not. 


// IllegalStateException- used when the state of our system is incorrect. That means the values of 
// properties have values that are not accepted by our funtion call. 

fun findCluster(number:Int){
    if(number<1) throw IllegalArgumentException("Hello IAE")
}

var userName=""

fun printUserName(){
    if(userName=="") throw IllegalStateException("Hii ISE")
}

fun main() {
    findCluster(0)
    printUserName()
}