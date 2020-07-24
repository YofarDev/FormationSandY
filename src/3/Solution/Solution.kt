package `3`.Solution

fun main() {

    // Exercice 1 :
    val a = 12
    val b = 7

    val min = if (a < b) a else b

    // Exercice 2 :
    val letter = 'a'

    when (letter) {
        'a', 'e', 'i', 'o', 'u', 'y' -> println("$letter est une voyelle")
        else -> println("$letter est une consonne")
    }


}