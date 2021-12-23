package day3

import java.io.File

fun main() {

    val lines = File("src/main/kotlin/day3/input.txt").readLines()

    val counts = lines.map {it.toCharArray().mapIndexed { index, c -> Pair(index, c.digitToInt()) }}
        .flatMap { it.asSequence() }
        .groupBy( keySelector = {it.first}, valueTransform = {it.second})
        .mapValues { (index, values) -> values.sum() }

    val gammaString = counts.toSortedMap().map { (key, value) -> if (value > lines.size/2) "1" else "0" }.joinToString("")
    val epsilonString = counts.toSortedMap().map { (key, value) -> if (value < lines.size/2) "1" else "0" }.joinToString("")

    val gamma = Integer.parseInt(gammaString, 2)
    val epsilon = Integer.parseInt(epsilonString, 2)

    println(gamma*epsilon)

}