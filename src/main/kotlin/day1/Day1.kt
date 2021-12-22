package day1

import java.io.File

fun main() {

    val numbers = File("src/main/kotlin/day1/input.txt").readLines().map(String::toInt)

    var increases = 0

    for (i in 1 until numbers.size) {
        if (numbers[i] > numbers[i-1]) {
            increases += 1
        }
    }
    println(increases)
}