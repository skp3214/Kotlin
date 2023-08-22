// Constant values in companion object. 

class Orders(val amountBeforeTax:Int){
    companion object{
        const val TAX_PERCENTAGE=5

        fun getnetOrderAmount(orderAmount:Int):Double{
            return orderAmount+(orderAmount*TAX_PERCENTAGE/100.0)
        }
    }
}

fun main() {
    val netorderAmount=Orders.getnetOrderAmount(Orders(500).amountBeforeTax)
    println(netorderAmount)
}