import kotlin.math.*
fun main() {
    fun part1(input: List<String>): Int {

        var referenceCalories = 0
        var currentCalories = 0

        for (line in input) {
            if (line.isEmpty()) {
                referenceCalories = max(referenceCalories, currentCalories)
                currentCalories = 0
            } else {
                val calories = line.toInt()
                currentCalories += calories
            }
        }

        referenceCalories = max(referenceCalories, currentCalories)

        return referenceCalories
    }

    fun part2(input: List<String>): Int {

        var currentCalories = 0
        val elfCalories = arrayListOf<Int>()

        for (line in input) {
            if (line.isEmpty()) {
                elfCalories.add(currentCalories)
                currentCalories = 0
            } else {
                val calories = line.toInt()
                currentCalories += calories
            }
        }

        elfCalories.add(currentCalories)
        val sortedElfCalories = elfCalories.sortedDescending()

        return sortedElfCalories[0] + sortedElfCalories[1] + sortedElfCalories[2]
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
