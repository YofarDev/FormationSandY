package c8.solution

fun main() {

    val cat = Cat("Le chat")
    val dog = Dog("Le chien")
    val bird = Bird("L'oiseau")

    cat.sleep()
    dog.sleep(false)
    bird.fly()
}


open class Animal(val name: String) {
    open fun sleep() = println("$name dort.")
}

class Cat(name: String) : Animal(name) {
    // Polymorphisme
    override fun sleep() = println("$name dort et ronronne.")
}

class Dog(name: String) : Animal(name) {
    // Surcharge
    fun sleep(isSleeping: Boolean)
            = if (isSleeping) super.sleep() else println("$name est réveillé.")
}

class Bird(name: String) : Animal(name) {
    fun fly() = println("$name s'envole.")
}






