package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(" ").let { it[0].toInt() to it[1].toDouble() }
    val x = StringTokenizer(readLine()).run { DoubleArray(n) { nextToken().toDouble() } }
    val v = StringTokenizer(readLine()).run { DoubleArray(n) { nextToken().toDouble() } }
    var min = Double.MAX_VALUE
    var max = 0.0
    for (i in 0..<n) {
        min = minOf(min, x[i] + v[i] * t)
        max = maxOf(max, x[i] - v[i] * t)
    }
    println(if (max < min + 1e-5) 1 else 0)
}