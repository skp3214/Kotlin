


fun main() {
    var myChar1:Char='a'  // this way also you can write.
    println(myChar1)
    
    var myChar2='b'
    println(myChar2)

    val myString="Hello"
    println(myString)

    // for multiline code

    val multiString=""" Hello My
    name is
    sachin Prajapati """
    print(multiString+"\n")

    // It is also possible to insert the value of variables into a String value. This is called a String template in Kotlin.

    val age = 70 
    val myString2 = "My age is $age"
    println(myString2)


    // converting char to string

    val myChar3='b'
    val myString4=myChar3.toString();
    println("char converted into String :$myString4");

    // Appending to a String

    val myString5 = "Hello"
    val myLongStrong = myString5 + " World"
    println(myLongStrong)

    // Length of a String

    val myString6="Hello"
    val lengthOfStr=myString6.length;
    println("$myString6 has lenght:$lengthOfStr characters.")

    // Searching Strings

    val startWithHel=myString5.startsWith("Hel")
    println(startWithHel)

    val endWithLo=myString5.endsWith("lo")
    println(endWithLo);

    val firsChar=myString5.first()
    println("\nFirst character in the string: $firsChar ")

    val lastChar=myString5.last()
    println("\nLast Character in the string: $lastChar ");

    val eQuals=myString5.equals("Hello")
    println(eQuals)

    // String Manipulation

    val upperCase=myString5.uppercase()
    print("\nUppercased string: ${upperCase}")

    var lowerCase=myString5.lowercase()
    print("\nLower cased string:${lowerCase}");

    val subString=myString5.substring(1)
    println("\nSubstring from index 0 till end is: $subString")




    
}