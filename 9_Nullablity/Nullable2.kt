data class Students(val fullName:String,var id:Int,var grade:Double)

val students=listOf<Students>(
    Students("John",102,3.5),
    Students("Mark",104,4.0) ,
    Students("Natali", 101 ,3.0),
    Students("Sara", 103 ,6.0)
    )

fun main() {
    println("Please, Enter the students's ID")
    val id=readln().toInt()
    println(getsStudentByID(id))
    println("Please enter the student's Name")
    val name=readln()
    println(searchInStudents(name)?: "the student is not found ")

}

fun getsStudentByID(id:Int):Students{
    return students.find { it.id==id }!!
}

fun searchInStudents(name:String):Students?{
    return students.find{it.fullName.lowercase()==name.lowercase()}
}

