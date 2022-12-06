fun main() {
    fun determineFirstMarker(dataStream: String, maxChars: Int): Int {
        var charIndex = 0
        while (dataStream.substring(charIndex, charIndex + maxChars).toCharArray().distinct().count() != maxChars) {
            charIndex++
        }

        return charIndex + maxChars
    }

    fun part1(input: List<String>): Int {

        val maxChars = 4
        return determineFirstMarker(input[0], maxChars)
    }

    fun part2(input: List<String>): Int {

        val maxChars = 14
        return determineFirstMarker(input[0], maxChars)
    }

    val input = readInput("Day06")
    println(part1(input))
    println(part2(input))
}