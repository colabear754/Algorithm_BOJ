package _24300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val bob = readLine().run { coerceAtMost(reversed()) }
        val alice = readLine().toCharArray()
        val count = IntArray(10)
        alice.forEach { count[it - '0']++ }
        loop@ for (i in n - 1 downTo 0) {
            val currentCount = count.clone()
            for (j in 0..<i) {
                if (--currentCount[bob[j] - '0'] < 0) continue@loop
            }
            val smallerDigit = (bob[i] - '1' downTo 1).firstOrNull { currentCount[it] > 0 } ?: continue@loop
            bw.write("${bob.substring(0, i)}$smallerDigit")
            currentCount[smallerDigit]--
            for (j in 9 downTo 1) {
                repeat(currentCount[j]) { bw.write("$j") }
            }
            return@repeat bw.newLine()
        }
        bw.appendLine(alice.apply { sortDescending() }.concatToString(0, n - 1))
    }
    bw.close()
}