// Use enum classes whenever you need to define a specific set of values.

enum class WeekDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun main() {
    val weekday = WeekDay.SUNDAY // or use the valueOf() method
    println(weekday)
    println(weekday.ordinal)

    for (l in WeekDay.values()){
        print("$l ")
    }
    

}
