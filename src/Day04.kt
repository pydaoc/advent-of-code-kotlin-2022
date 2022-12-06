fun main() {

    fun checkMinusLists(list1: IntRange, list2: IntRange): Boolean {
        return !list1.minus(list2).any() || !list2.minus(list1).any()
    }

    fun checkIntersectLists(list1: IntRange, list2: IntRange): Boolean {
        return list1.intersect(list2).any() || list2.intersect(list1).any()
    }

    fun determineAssignmentPairs(input: List<String>, checkLists: (list1: IntRange, list2: IntRange) -> Boolean): Int {

        var numberOfFullyContainsPairs = 0
        for (line in input) {
            val lineParts = line.split(',')
            val linePart1 = lineParts[0]
            val linePart2 = lineParts[1]
            val valuesForLinePart1 = linePart1.split('-').map { it.toInt() }
            val valuesForLinePart2 = linePart2.split('-').map { it.toInt() }
            val value1ForLinePart1 = valuesForLinePart1[0]
            val value2ForLinePart1 = valuesForLinePart1[1]
            val value1ForLinePart2 = valuesForLinePart2[0]
            val value2ForLinePart2 = valuesForLinePart2[1]

            val list1 = IntRange(value1ForLinePart1, value2ForLinePart1)
            val list2 = IntRange(value1ForLinePart2, value2ForLinePart2)

            if (checkLists(list1, list2)) {
                numberOfFullyContainsPairs++
            }
        }

        return numberOfFullyContainsPairs
    }

    fun part1(input: List<String>): Int {

        return determineAssignmentPairs(input, ::checkMinusLists)
    }

    fun part2(input: List<String>): Int {

        return determineAssignmentPairs(input, ::checkIntersectLists)
    }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}