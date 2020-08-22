package tp.models

import kotlin.random.Random

// On a une classe abstraite Level, et les classes One, Two, Three qui en héritent
// Cette organisation permet d'ajouter des niveaux facilement
abstract class Level(var equation: String?,
                     var answer: Int?, open var point: Int) {

    abstract fun generateEquation()

    constructor() : this(null, null, 0)
}

// Niveau 1 = xx + xx
class One(override var point: Int = 1) : Level() {
    override fun generateEquation() {
        val n1 = Random.nextInt(1, 99)
        val n2 = Random.nextInt(1, 99)
        equation = "$n1 + $n2 = ?"
        answer = n1 + n2
    }
}

// Niveau 2 = xxx - xx + xx
class Two(override var point: Int = 2) : Level() {
    override fun generateEquation() {
        val n1 = Random.nextInt(100, 999)
        val n2 = Random.nextInt(1, 99)
        val n3 = Random.nextInt(1, 99)
        equation = "$n1 - $n2 + $n3 = ?"
        answer = n1 - n2 + n3
    }
}

// Niveau 3 = x * xx
class Three(override var point: Int = 3) : Level() {
    override fun generateEquation() {
        val n1 = Random.nextInt(1, 9)
        val n2 = Random.nextInt(1, 99)
        equation = "$n1 * $n2 = ?"
        answer = n1 * n2
    }
}


