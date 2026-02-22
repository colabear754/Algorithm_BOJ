package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = IntArray(readLine().toInt()) { readLine().toInt() }
    val max = cases.max()
    val dp = Array(max + 1) { IntArray(10) }
    repeat(10) { dp[1][it] = 1 }
    for (i in 2..max) {
        val prev = dp[i - 1].clone()
        dp[i][0] = prev[7]
        dp[i][1] = prev[2] + prev[4]
        dp[i][2] = prev[1] + prev[3] + prev[5]
        dp[i][3] = prev[2] + prev[6]
        dp[i][4] = prev[1] + prev[5] + prev[7]
        dp[i][5] = prev[2] + prev[4] + prev[6] + prev[8]
        dp[i][6] = prev[3] + prev[5] + prev[9]
        dp[i][7] = prev[4] + prev[8] + prev[0]
        dp[i][8] = prev[5] + prev[7] + prev[9]
        dp[i][9] = prev[6] + prev[8]
        repeat(10) { dp[i][it] %= 1234567 }
    }
    cases.forEach { bw.appendLine("${dp[it].sum() % 1234567}") }
    bw.close()
}