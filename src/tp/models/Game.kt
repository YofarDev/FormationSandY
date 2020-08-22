package tp.models

import java.lang.Exception

// On détermine ici les valeurs par défaut au début du jeu
class Game(var score: Int = 0,
           var life: Int = 2,
           var level: Level = One(),
           var goodAnswer: Int = 0) {


    // On génere l'équation puis on l'affiche
    fun start() {
        level.generateEquation()
        askEquation()
    }

    // On affiche l'équation au joueur et gère sa réponse
    // On 'catch' l'exception si il n'entre pas un nombre entier
    private fun askEquation() {
        println(level.equation)
        try {
            when (readLine()?.toInt()) {
                level.answer -> goodAnswer()
                else -> wrongAnswer()
            }
        } catch (e: Exception) {
            incorrectInput()
        }
    }

    // Si la réponse est bonne :
    // On augmente le score (les points ajoutés dépendent du niveau)
    // On affiche le score
    // On augmente le nombre total de bonnes réponses
    // On vérifie si on a atteind un palier de bonne réponse pour passer au niveau suivant
    // On génère une nouvelle équation
    private fun goodAnswer() {
        score += level.point
        println("Bravo ! Score : $score")
        goodAnswer++
        updateLevel()
        level.generateEquation()
        askEquation()
    }

    // Les paliers de bonnes réponses :
    // A 2 bonnes réponses on passe au niveau 2, à 4 au niveau 3
    // (cette organisation permet d'ajouter des niveaux facilement)
    private fun updateLevel() {
        when (goodAnswer) {
            2 -> level = Two()
            4 -> level = Three()
        }
    }

    // Si la réponse est mauvaise :
    // On enleve une vie
    // On vérifie si il a au moins une vie
    // Si oui on affiche le nombre de vie(s) restante(s) et on repose l'équation
    // Si non, c'est game over
    private fun wrongAnswer() {
        println("C'est faux !")
        life--
        if (life > 0) {
            println("Il vous reste $life vie(s)")
            askEquation()
        } else gameOver()
    }

    // Si la réponse entrée n'est pas un nombre entier
    // On affiche un message et on repose l'équation
    private fun incorrectInput() {
        println("Seulement les nombres entiers sont acceptés")
        askEquation()
    }

    // Quand on a plus de vie, c'est la fin du jeu (et du programme)
    private fun gameOver() {
        println("Game over ! Score : $score")
    }


}

