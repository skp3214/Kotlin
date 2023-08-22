data class DiscountCoupon(
    val percentage:Int,
    val minimumOrderAmount:Int
)

fun main() {
    val orderAmount=134
    val discountCouponList=listOf(
        DiscountCoupon(percentage = 20 ,minimumOrderAmount=5),
        DiscountCoupon(percentage = 18 ,minimumOrderAmount=7),
        DiscountCoupon(percentage = 16 ,minimumOrderAmount=9)
    )

    val discountValueList=discountCouponList.map { 
        discountCoupon->
        if(orderAmount>=discountCoupon.minimumOrderAmount){
            (orderAmount*discountCoupon.percentage)/100
        }
        else{
            0
        }
     }

     println(discountValueList)
}