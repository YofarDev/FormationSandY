package c6.solution

import java.util.*

fun main() {
    for (user in getUsers2()) printMessage(user)
}

fun getUsers2() = listOf(
    "John Smith - johnsmith@mail.com - 08/08/1988",
    "sarah JACKSON - hannah.03@hotmail - 23/03/2003",
    "Clément Maton - clecat-du-75@mail.com - 18/11/1991")


fun printMessage2(user: String) =
    println(getName(user) + " ("
            + getEmail(user) + ") est sur sa "
            + getAge(user) + "ème année !")


fun getName2(user: String) =
    user.substring(0, user.indexOf('-') - 1).toUpperCase()


fun getEmail2(user: String) =
    user.substring(user.indexOf('-') + 2, user.lastIndexOf('-') - 1)


fun getAge2(user: String) =
    Calendar.getInstance().weekYear - user.substring(user.lastIndexOf('/') + 1).toInt()
