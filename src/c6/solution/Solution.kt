package c6.solution

import java.util.*

fun main() {
    for (user in getUsers()) printMessage(user)
}

fun getUsers() = listOf(
    "John Smith - johnsmith@mail.com - 08/08/1988",
    "sarah JACKSON - hannah.03@hotmail - 23/03/2003",
    "Clément Maton - clecat-du-75@mail.com - 18/11/1991")


fun printMessage(user: String) {
    val name = getName(user)
    val email = getEmail(user)
    val age = getAge(user)

    // petite astuce : '\b' permet de supprimer l'espace entre '$age' et 'ème'
    println("$name ($email) est sur sa $age \bème année !")
}

fun getName(user: String): String {
    val name = user.substring(0, user.indexOf('-') - 1)
    return name.toUpperCase()
}

fun getEmail(user: String): String {
    // +2 et -1 servent à supprimer les espaces inutiles
    val indexStart = user.indexOf('-') + 2
    val indexEnd = user.lastIndexOf('-') - 1
    return user.substring(indexStart, indexEnd)
}


fun getAge(user: String): Int {
    val currentYear = Calendar.getInstance().weekYear
    val birthday = user.substring(user.lastIndexOf('/') + 1).toInt()
    return currentYear - birthday
}
