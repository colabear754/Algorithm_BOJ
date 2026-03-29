package _14900

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val solutions = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var min = Int.MAX_VALUE
    var left = 0
    var right = n - 1
    while (left < right) {
        val sum = solutions[left] + solutions[right]
        if (sum == 0) return@with println(0)
        if (abs(min) > abs(sum)) min = sum
        if (sum < 0) left++ else right--
    }
    println(min)
}