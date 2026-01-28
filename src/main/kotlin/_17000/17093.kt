package _17000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val points = Array(n) { StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } } }
    var result = 0L
    repeat(m) {
        val (x, y) = StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } }
        points.forEach { result = maxOf(result, (it[0] - x).pow() + (it[1] - y).pow()) }
    }
    println(result)
}

private fun Long.pow() = this * this