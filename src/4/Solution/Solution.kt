package `4`.Solution

import kotlin.random.Random


fun main() {

    // On initialise le score
    var points = 0

    do {
        // On génère deux nombres aléatoires :
        val number1 = Random.nextInt(1, 10)
        val number2 = Random.nextInt(1, 100)
        // On les additione
        val sum = number1 + number2

        do {
            // Boolean qui va signaler que la bonne réponse a été trouvé
            var wrongAnswer = true
            // On affiche l'addition à l'utilisateur et on attend sa réponse
            println("$number1 + $number2 = ?")
            val answer = readLine()!!

            // Si c'est la bonne réponse...
            if (answer.toInt() == sum) {
                // On ajoute +1 point
                points++
                // On affiche le score actualisé
                println("Bonne réponse ! Tu as $points point(s).")
                // On met à jour la condition pour sortir de la boucle
                wrongAnswer = false

                // Si c'est la mauvaise réponse, on met un message et
                // cette boucle s'exécute à nouveau
            } else println("C'est faux, essaye encore !")
        } while (wrongAnswer)


        // Le jeu s'arrête quand l'utilisateur a 3 points
    } while (points < 3)

    // Le message final
    println("Fin du jeu")

}