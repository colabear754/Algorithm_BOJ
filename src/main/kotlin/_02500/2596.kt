package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val encrypted = readLine().chunked(6)
    val pure = arrayOf("000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010")
    val sb = StringBuilder()
    loop@ for (i in 0..<n) {
        for (j in pure.indices) {
            var differentCount = 0
            for (k in 0..<6) {
                if (encrypted[i][k] != pure[j][k]) {
                    differentCount++
                    if (differentCount > 1) break
                }
            }
            if (differentCount <= 1) {
                sb.append('A' + j)
                continue@loop
            }
        }
        return@with println(i + 1)
    }
    println(sb)
}