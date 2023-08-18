// Default args

fun openBrowser(url:String, incognitoMode:Boolean){
    println("Opening $url"+if(incognitoMode)" in incognito Mode" else "")
}

fun openBrowser2(url2:String="www.google.com", incognitoMode2:Boolean=false){
    println("Opening $url2"+if(incognitoMode2)" in incognitoMode" else "")
}

// Named arguments: in this order doesnot matter

fun cheer(how:String,who:String){
    println("$how $who")
}

fun main() {

    openBrowser("www.google.com", false)
    openBrowser("www.google.com", true)
    openBrowser2()   // defaul value passed in parameters will be used
    openBrowser2("www.gaana.com")
    openBrowser2("www.spotify.com", true)

    // for named args order doesnot matter

    cheer(how="hi", who="Sachin")
    cheer(who="sachin",how="hi")


}