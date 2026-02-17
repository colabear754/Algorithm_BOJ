package _11000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var max = 0
    val inputs = lineSequence().map { it.toInt().also { n -> max = maxOf(n, max) } }.toList()
    val validNumbers = ArrayList<Int>()
    fun generateNonDuplicateNumber(current: Int, userBit: Int) {
        if (current > 0) validNumbers.add(current)
        for (i in 1..9) {
            if (userBit and (1 shl i) == 0) {
                generateNonDuplicateNumber(current * 10 + i, userBit or (1 shl i))
            }
        }
    }
    generateNonDuplicateNumber(0, 0)
    validNumbers.sort()
    inputs.forEach { n ->
        if (n > 987654321) {
            bw.appendLine("0")
            return@forEach
        }
        bw.appendLine("${validNumbers[validNumbers.binarySearch(n).let { if (it < 0) -it - 1 else it + 1 }]}")
    }
    bw.close()
}