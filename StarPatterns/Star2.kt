fun main() {
    print("Enter the number of rows: ")
    val rows=readLine()?.toIntOrNull()
    if(rows==null) return

    for(i in 1..rows){
        for(j in rows downTo i+1){
            print(" ")
        }
        for(k in 1..i){
            print("*")
        }
        println()
    }
}