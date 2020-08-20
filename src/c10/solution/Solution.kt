package c10.solution

import c10.solution.utils.isEven


fun main() {
    val numbers = listOf(4, 8, 15, 16, 23, 42)
    for (n in numbers) printEvenOrOdd(n)
}

fun printEvenOrOdd(n: Int) =
        if (isEven(n)) println("$n est pair") else println("$n est impair")


