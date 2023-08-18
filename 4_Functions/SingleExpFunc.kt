

fun biggerOf(a:Int,b:Int):Int{
    if(a>b){
        return a
    }
    else{
        return b;
    }

}

// above function can be also written as:
// fun biggerOf(a:Int,b:Int):Int=if(a>b) a else b

// fun {function name}({parameters}): {result type} = {expression body}

fun main() {
    println(biggerOf(5,3))
}