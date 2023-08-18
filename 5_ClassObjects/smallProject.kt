/**
 *  
Scenario

Imagine you have secured a job with a game development company. Your first assignment is to create a small piece of code to hold the player data for one of their games. The requirements of your program are:

Store and display the player’s full name 

Store, manipulate and display the player’s score data 

Store and display a personal best score (players get a score for each level played) 

Display the winning player’s name and their total score and their best level score

When all your code is completed you will have a final console output that simulates an end-of-game score. You will have two lines each with text and a player score.  (This is just an example of the output, you will input level sores later to produce a final result).

 */

 class Player(var name:String, var surName:String){
    var totalScore=0
    var personalBestScore=0
    fun fullName():String{
        return name+" "+surName;
    }
 }

 class Scores(){
    fun checkBest(best:Int,current:Int):Int{
        if((best< current)){
            return current;
    }
    return best;

 }

fun main() {
    val P1=Player("Sachin", "Prajapati")
    val P2=Player("Harsh","Singh")

    val scoring=Scores()
    var lvlScore=0

    // Level 1

    lvlScore=12
    P1.totalScore+=lvlScore
    P1.personalBestScore=scoring.checkBest(P1.personalBestScore, lvlScore)

    lvlScore=34
    P2.totalScore+=lvlScore
    P2.personalBestScore=scoring.checkBest(P2.personalBestScore, lvlScore)

    // Level 2

    lvlScore=56
    P1.totalScore+=lvlScore
    P1.personalBestScore=scoring.checkBest(P1.personalBestScore, lvlScore)

    lvlScore=78
    P2.totalScore+=lvlScore
    P2.personalBestScore=scoring.checkBest(P2.personalBestScore, lvlScore)

    if(P1.totalScore>P2.totalScore){
        println("The winner is"+P1.fullName()+"with a score of"+P1.totalScore)
        println("Personal Best score = "+P1.personalBestScore)
    }
    else{
        println("The winner is"+P2.fullName()+"with a score of"+P2.totalScore)
        println("Personal Best score = "+P2.personalBestScore)

    }

}