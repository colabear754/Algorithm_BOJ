package _33800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, a, b) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
    val grid = Array(2) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val isPrime = BooleanArray(200001) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..447) {
        if (isPrime[i]) {
            for (j in i * i..200000 step i) isPrime[j] = false
        }
    }
    val dp = IntArray(n + 1)
    fun Int.score() = if (isPrime[this]) a else b
    dp[0] = 0
    dp[1] = (grid[0][0] + grid[1][0]).score()
    for (i in 2..n) {
        dp[i] = maxOf(dp[i - 1] + (grid[0][i - 1] + grid[1][i - 1]).score(), dp[i - 2] + (grid[0][i - 2] + grid[0][i - 1]).score() + (grid[1][i - 2] + grid[1][i - 1]).score())
    }
    println(dp[n])
}