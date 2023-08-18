// You can inherit class also but you have to use word "open" before class 
// because we are actually overriding it.
// you can modify or overide class function or parameter but you have to use open before it
// below is the example
// open class Team(open val playeName: String){
// open fun play(){
// println("Playing")
//    }
// }
// now you can override class, playerName,and play() function in any class you are inheriting them. 

open class Dogs(val breed:String){ } // Dogs==Dog because in same package i cannot use Dog again. 
    
class Labrador(val name: String):Dogs("Labrador Retriever") 

fun main() {
    var lab=Labrador("Coco")
    println(lab.breed)
    println(lab.name)
}


 