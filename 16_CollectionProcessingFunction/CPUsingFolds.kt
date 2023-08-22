class OtherRecipeBook{
    private val dishes=listOf(
        Dish("Fish and chips", setOf("cod","Chips","Oil","Flour")),
        Dish("Pasta with meatballs",setOf("pasta","meatball","oil")),
        Dish("Spaghetti bolognese",setOf("spaghetti","bolognese")),

    )

    fun allIngredients()=dishes.fold(mutableSetOf<String>()){
        acc,dish-> acc.apply{
            addAll(dish.ingredients)
        }
    }

    data class Dish(
        val name:String,
        val ingredients:Set<String>
    )
}

fun main() {
    println(OtherRecipeBook().allIngredients())
}