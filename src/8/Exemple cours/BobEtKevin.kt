package `8`.`Exemple cours`

fun main() {

    val bob = Human("Bob")
    val kevin = Orc("Kevin")

    println("===== Round 1 =====")
    bob.attack(kevin)
    println("===== Round 2 =====")
    kevin.attack(bob)

}

open class Character(val name: String, var health: Int, var strength: Int) {

    open fun attack(ennemy: Character) {
        ennemy.health -= strength
        println("$name a attaqué ${ennemy.name} et lui a infligé $strength points de dégats !")
    }

    fun printHealth() = println("$name a $health points de vie restants.")

}

class Human(name: String) : Character(name, 120, 20) {

    override fun attack(ennemy: Character) {
        println("\"POUR LE ROOOOI\"")
        super.attack(ennemy)

    }
}

class Orc(name: String) : Character(name, 100, 40) {

    override fun attack(ennemy: Character) {
        println("\"RRRRRRRRRH\"")
        super.attack(ennemy)
    }
}


