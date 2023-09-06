fun main() {
    print("Enter the number of rows: ")
    val n=readLine()?.toIntOrNull()
    if(n==null) return
    for(i in 1..n){
        for(j in 0..(n-i)){
            print("  ")
        }
        for(k in 1..(2*i-1)){
            print(" *")
        }
        println()
    }
    for(i in (n-1) downTo 1){
        for(k in 1..(n+1-i)){
            print("  ")
        }
        for(j in 1..(2*i-1)){
            print(" *")
        }
        println()

    }
}