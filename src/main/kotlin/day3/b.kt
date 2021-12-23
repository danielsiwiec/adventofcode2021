package day3

import java.io.File

fun main() {

    var lines = File("src/main/kotlin/day3/input.txt").readLines()

    for (index in 0 until lines[0].length) {
        val count = lines.map { it[index].digitToInt() }.sum()
        val mostCommon = if (count >= lines.size / 2.0) '1' else '0'
        lines = lines.filter { it[index] == mostCommon }
        if (lines.size == 1) break
    }

    val oxyGenerator = Integer.parseInt(lines[0], 2)

    lines = File("src/main/kotlin/day3/input.txt").readLines()

    for (index in 0 until lines[0].length-1) {
        val count = lines.map { it[index].digitToInt() }.sum()
        val mostCommon = if (count >= lines.size / 2.0) '1' else '0'
        lines = lines.filter { it[index] != mostCommon }
        if (lines.size == 1) break
    }

    val co2Scrubber = Integer.parseInt(lines[0], 2)

    println(oxyGenerator * co2Scrubber)

}