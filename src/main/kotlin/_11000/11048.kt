package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { IntArray(m + 1) }
    for (i in 1..n) {
        StringTokenizer(readLine()).run { for (j in 1..m) {
            dp[i][j] = nextToken().toInt() + maxOf(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1])
        } }
    }
    println(dp[n][m])
}