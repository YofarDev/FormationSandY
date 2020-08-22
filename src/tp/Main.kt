package tp

import tp.models.Game

// Au lancement on affiche le message d'introduction,
// puis on gère la réponse du joueur
fun main() {
    displayIntroduction()
    getAnswer()
}

// Le message d'introduction
private fun displayIntroduction() {
    println("================================")
    println("Bienvenue dans ce jeu de calcul mental")
    println("Etes vous prêt à commencer?")
    println("================================")
}

// La gestion de la réponse du joueur :
// 1 -> On commence le jeu
// 2 -> Petit message puis on redemande si il est prêt
// Autre réponse -> on redemande une réponse
// (On pouvait très bien utiliser une boucle ici plutôt qu'une fonction récursive)
private fun getAnswer() {
    println("Tapez 1 pour oui, 2 pour non")
        when (readLine()) {
            "1" -> startGame()
            "2" -> waitPlayerIsReady()
            else -> getAnswer()
        }
}

// On lance le jeu
private fun startGame() {
    val game = Game()
    game.start()
}

// Message "d'attente"
private fun waitPlayerIsReady() {
    println("Prenez votre temps...")
    println("Etes vous prêt maintenant?")
    getAnswer()
}

