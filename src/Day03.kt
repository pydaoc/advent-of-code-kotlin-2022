fun main() {

    fun generateAlphabet(): Set<Char> {
        var lowercaseFirstCharacter = 'a'

        val lowercaseAlphabet = generateSequence {
            (lowercaseFirstCharacter++).takeIf { it <= 'z' }
        }

        var uppercaseFirstCharacter = 'A'

        val uppercaseAlphabet = generateSequence {
            (uppercaseFirstCharacter++).takeIf { it <= 'Z' }
        }

        val alphabet = lowercaseAlphabet.toList().union(uppercaseAlphabet.toList())

        println(alphabet.toList())

        return alphabet
    }

    fun part1(input: List<String>): Int {

        val alphabet = generateAlphabet()

        var result = 0

        for (line in input) {
            val partOne = line.substring(0, line.length / 2)
            val partTwo = line.substring(line.length / 2)
            val charactersPartOne = partOne.toCharArray()
            val charactersPartTwo = partTwo.toCharArray()

            val commonCharacter = charactersPartOne.intersect(charactersPartTwo.toSet()).first()
            result += alphabet.indexOf(commonCharacter) + 1
        }

        return result
    }

    fun part2(input: List<String>): Int {

        val alphabet = generateAlphabet()

        var result = 0
        for (i in 0 until input.count() step 3) {
            val lineOne = input[i]
            val lineTwo = input[i + 1]
            val lineThree = input[i + 2]
            val charactersLineOne = lineOne.toCharArray()
            val charactersLineTwo = lineTwo.toCharArray()
            val charactersLineThree = lineThree.toCharArray()

            val commonCharacter = charactersLineOne
                .intersect(charactersLineTwo.toSet())
                .intersect(charactersLineThree.toSet())
                .first()

            result += alphabet.indexOf(commonCharacter) + 1
        }

        return result
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}