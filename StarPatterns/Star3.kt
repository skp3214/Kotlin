fun main() {
    print("Enter the number of rows: ")
    val n = readLine()?.toIntOrNull()
    if(n==null) return
    for(i in 1..n){
        for(j in n downTo i){
            print("*")
        }
        println()
    }
}