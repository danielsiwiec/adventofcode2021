package day1

import java.io.File

fun main() {

    val numbers = File("src/main/kotlin/day1/input.txt").readLines().map(String::toInt)

    val increases = numbers.subList(0, numbers.size - 1)
        .mapIndexed { index, i -> Pair(i, numbers[index + 1]) }
        .count { pair -> pair.first < pair.second }

    println(increases)
}