package _25700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val height = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val dp = IntArray(n) { 1 }
    for (i in n - 1 downTo 0) {
        if (i + height[i] + 1 < n) dp[i] = dp[i + height[i] + 1] + 1
    }
    println(dp.joinToString(" "))
}