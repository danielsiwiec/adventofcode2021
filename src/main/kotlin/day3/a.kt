package day3

import java.io.File

fun main() {

    val lines = File("src/main/kotlin/day3/input.txt").readLines()
    val counts = mutableMapOf<Int, Int>()

    for (line in lines) {
        for ((index, digit) in line.withIndex()) {
            val currentCount = counts.getOrDefault(index, 0)
            if (digit == '1') {
                counts[index] = currentCount + 1
            }
        }
    }

    val gammaString = counts.toSortedMap().values.map {if (it > lines.size/2) '1' else '0' }
    val epsilonString = counts.toSortedMap().values.map {if (it < lines.size /2) '1' else '0' }

    val gamma = Integer.parseInt(gammaString.joinToString(""), 2)
    val epsilon = Integer.parseInt(epsilonString.joinToString(""), 2)

    println(gamma*epsilon)

}