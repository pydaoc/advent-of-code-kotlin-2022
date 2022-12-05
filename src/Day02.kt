fun main() {
    fun part1(input: List<String>): Int {

        // A for Rock, B for Paper, and C for Scissors
        // X for Rock, Y for Paper, and Z for Scissors
        // 1 for Rock, 2 for Paper, and 3 for Scissors
        // 0 if you lost, 3 if the round was a draw, and 6 if you won

        // AX = 4 // Draw + Rock // 3 + 1
        // AY = 8 // Won + Paper // 6 + 2
        // AZ = 3 // Lost + Scissors // 0 + 3

        // BX = 1 // Lost + Rock // 0 + 1
        // BY = 5 // Draw + Paper // 3 + 2
        // BZ = 9 // Won + Scissors // 6 + 3

        // CX = 7 // Won + Rock // 6 + 1
        // CY = 2 // Lost + Paper // 0 + 2
        // CZ = 6 // Draw + Scissors // 3 + 3

        var total = 0
        for (line: String in input) {
            when (line) {
                "A X" -> total += 4
                "A Y" -> total += 8
                "A Z" -> total += 3
                "B X" -> total += 1
                "B Y" -> total += 5
                "B Z" -> total += 9
                "C X" -> total += 7
                "C Y" -> total += 2
                "C Z" -> total += 6
            }
        }
        return total
    }

    fun part2(input: List<String>): Int {

        // A for Rock, B for Paper, and C for Scissors
        // 1 for Rock, 2 for Paper, and 3 for Scissors
        // 0 if you lost, 3 if the round was a draw, and 6 if you won
        // X --> Lost, Y --> Draw, Z --> Win

        // AX  Lost - Scissors - 0+3 = 3
        // AY = Draw - Rock - 3+1 = 4
        // AZ = Win - Paper - 6+2 = 8

        // BX = Lost - Rock - 0+1 = 1
        // BY = Draw - Paper - 3+2 = 5
        // BZ = Win - Scissors - 6+3 = 9

        // CX = Lost - Paper - 0+2 = 2
        // CY = Draw - Scissors - 3+3 = 6
        // CZ = Win - Rock - 6+1 = 7

        var total = 0
        for (line: String in input) {
            when (line) {
                "A X" -> total += 3
                "A Y" -> total += 4
                "A Z" -> total += 8
                "B X" -> total += 1
                "B Y" -> total += 5
                "B Z" -> total += 9
                "C X" -> total += 2
                "C Y" -> total += 6
                "C Z" -> total += 7
            }
        }
        return total
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}