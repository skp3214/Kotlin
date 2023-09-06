fun main() {
    print("Enter the number of rows: ")

    val row=readLine()?.toIntOrNull()
    if(row==null) return
    for(i in row downTo 1){
        for(k in 0..(row-i)){
            print(" ")
        }
        for(j in 1..(2*i-1)){
            print("*")
        }

        println()
    }
}