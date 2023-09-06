fun main() {
    print("Enter the number of rows: ")
    val n=readLine()?.toIntOrNull()
    if(n==null) return 
    for(i in 1..n){
        for(j in 1..(n-i)){
            print(" ")
        }
        for(j in 1..(2*i-1)){
            print("*")
        }
        println()
    }
}