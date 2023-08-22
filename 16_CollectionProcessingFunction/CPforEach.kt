class Menu {
    private val menuItems =
            listOf(
                    MenuItem("Pizza", 20.5),
                    MenuItem("Burger", 18.9),
                    MenuItem("Fries", 34.6),
                    MenuItem("Sandwich", 7.5)
            )

    fun printDiscountedMenu(discount: Double) {
        menuItems.forEach { menuItem ->
            println(menuItem.copy(price = menuItem.price * (1.0 - discount)))
        }
    }

    data class MenuItem(val name: String, val price: Double)
}

fun main() {
    Menu().printDiscountedMenu(0.3)
}
