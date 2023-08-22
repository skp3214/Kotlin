class RecipeBook{
    private val dishes=listOf(
        Dish("Fish and Chips", setOf("Cod","Chips","Oil","Flour")),
        Dish("Pasta with Tomato Sauce",setOf("Tomatoes","Noodles","Salt","Pepper")),
        Dish("Salmon Patties",setOf("Salmon","Butter","Peas")),
    
    )


    fun dishesWithIngredients(ingredient:String)=dishes.filter { 
        it.ingredients.contains(ingredient)
     }


    data class Dish(
        val name:String,
        val ingredients:Set<String>
    )
}

fun main() {
    println(RecipeBook().dishesWithIngredients("Peas"))
}