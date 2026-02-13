package _28100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.apply { sort() }
    var max = 0
    var result = -1
    for (i in 0..<n) {
        val gap = (a[i + 1] - a[i]) / 2
        if (gap > max) {
            max = gap
            result = (a[i + 1] + a[i]) / 2
        }
    }
    println(result)
}