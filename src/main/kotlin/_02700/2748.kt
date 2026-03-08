package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = LongArray(n + 1)
    dp[1] = 1L
    for (i in 2..n) dp[i] = dp[i - 1] + dp[i - 2]
    println(dp[n])
}