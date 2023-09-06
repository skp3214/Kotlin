fun main() {
    print("Enter the number of rows: ")
    val row=readLine()?.toIntOrNull()
    if(row==null) return
    for(i in 1..row){
        for(j in 1..i)
        print("*")
        println()
    }

}