// If you want to define a variable that can be used by multiple functions
// you need to define it in a wider scope. 

var name=""

fun setName(){
    name="mike"
}

fun printName(){
    println(name)  // this will print mike because the value of name is defined outside. 

}

fun main() {
    setName()   // call function
    printName()
    println(name)
}