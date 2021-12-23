package day1

import java.io.File

fun main() {

    val numbers = File("src/main/kotlin/day1/input.txt").readLines().map(String::toInt)

    val readings = numbers.subList(0, numbers.size - 2)
        .mapIndexed { index, i -> i + numbers[index + 1] + numbers[index + 2] }

    val increases = readings.subList(0, readings.size - 1)
        .mapIndexed { index, i -> Pair(i, readings[index + 1]) }
        .count { pair -> pair.first < pair.second }

    println(increases)
}