class AddressBook{
    private val employees=listOf(
        Employee("John","2022/01/07"),
        Employee("Jane","2022/04/15"),
        Employee("Mike","2022/08/29"),
        Employee("Bob","2022/02/12")
    )

    fun newEmployee(startDate:String)= employees.filter { 
        it.startDate>=startDate
     }

    data class Employee(
        val name:String,
        val startDate:String
    )
}

fun main() {
    println(AddressBook().newEmployee("2022/01/15"))
}

