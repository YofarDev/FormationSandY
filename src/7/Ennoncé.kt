package `7`

fun main() {

    val user1 = User("John Smith", "johnsmith@mail.com", 1988)
    val user2 = User("Sarah Jackson", "hannah.03@hotmail", 2003)
    val user3 = User("Clément Maton", "clecat-du-75@mail.com", 1991)

    val users = listOf(user1, user2, user3)
    for (user in users) user.printAge()

}


// Créer la classe User et la fonction printAge() permettant d'imprimer l'age