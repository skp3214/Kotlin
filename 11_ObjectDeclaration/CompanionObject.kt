// Companion Object: One instance that can access a class.
// In order to achieve the feature of static class we have companion object. 
// It is associated with class and a class can only have one companion object. 


class Waiter{
    var id:Int=-1
    var name: String=""

    fun serveCustomer(){
        println("Serve customer")
    }

    companion object Registration{
        var branchName:String=""
        var branchAddress:String=""

    }
}

fun main() {
    // Waiter.Registration.branchName="Little Lemon Branch"
    // Waiter.Registration.branchAddress="Chicago"
    
    // No need write it like above. 
    // You can still access branch name because each class can 
    // only have one companion object and no need mention it. 
    
    
    Waiter.branchName="Little Lemon Branch"
    Waiter.branchAddress="Chicago"
    
    println(Waiter.branchName)
    println(Waiter.branchAddress)
    

}

