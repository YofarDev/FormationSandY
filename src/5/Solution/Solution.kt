package `5`.Solution

fun main() {
    val list = listOf(12, 233, 42, 495, 99, 123, 233, 4, 8, 15, 16, 23, 42)
    val even = mutableListOf<Int>()
    val odd = mutableListOf<Int>()

    for (number in list.toSet()) {
        if (number % 2 == 0) even.add(number)
        else odd.add(number)
    }

    println("Il y a ${even.size} nombres pairs et ${odd.size} nombres impairs !")
}