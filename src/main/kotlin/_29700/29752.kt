package _29700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var max = 0
    var current = 0
    StringTokenizer(readLine()).run { repeat(n) {
        if (nextToken().toInt() == 0) {
            current = 0
            return@repeat
        }
        max = maxOf(max, ++current)
    } }
    println(max)
}