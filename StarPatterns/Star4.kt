fun main() {
    print("Enter the number of rows: ")
    val rows=readLine()?.toIntOrNull()
    if(rows==null) return

    for(i in 1..rows){
        for(k in 0..(i-1)){
            print(" ")
        }
        for(j in rows downTo i){
            print("*")
        }
        println()
    }

}