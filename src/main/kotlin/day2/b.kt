package day2

import java.io.File

fun main() {

    var depth = 0
    var forward = 0
    var aim = 0

    val lines = File("src/main/kotlin/day2/input.txt").readLines()

    for (line in lines) {
        val split = line.split(' ')
        val value = Integer.parseInt(split[1])
        if (split[0] == "forward") {
            forward += value
            depth += value * aim
        } else if (split[0] == "up") {
            aim -= value
        } else if (split[0] == "down") {
            aim += value
        }
    }

    println(forward * depth)

}