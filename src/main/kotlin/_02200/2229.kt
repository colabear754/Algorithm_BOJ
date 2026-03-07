package _02200

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val scores = IntArray(n + 1)
    val dp = IntArray(n + 1)
    val st = StringTokenizer(readLine())
    var max = 0
    for (i in 1..n) {
        scores[i] = st.nextToken().toInt()
        for (j in 1..<i) {
            max = maxOf(max, abs(scores[i] - scores[j]) + dp[j - 1])
        }
        dp[i] = max
    }
    println(dp[n])
}