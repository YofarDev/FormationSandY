package `6`

// A l'aide de la liste de String,
// imprimer dans la console pour chaque utilisateur
// un message au format :
// "x (email) est sur sa n-ème année !"
// x étant le prénom et le nom EN MAJUSCULE
// n étant l'année actuelle - sa date de naissance


fun main() {
    for (user in `6`.Solution.getUsers()) `6`.Solution.printMessage(user)
}

fun getUsers() = listOf(
    "John Smith - johnsmith@mail.com - 08/08/1988",
    "sarah JACKSON - hannah.03@hotmail - 23/03/2003",
    "Clément Maton - clecat-du-75@mail.com - 18/11/1991")

fun printMessage(user: String) {
    // A compléter
}

fun getName(user: String): String {
    // A compléter
    return ""
}


fun getEmail(user: String): String {
    // A compléter
    return ""
}


fun getAge(user: String): Int {
    // A compléter
    return 0
}