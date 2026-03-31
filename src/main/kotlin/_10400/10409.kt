package _10400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(" ").map { it.toInt() }
    val jobs = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var sum = 0
    for (i in 0..<n) {
        sum += jobs[i]
        if (sum > t) return@with println(i)
    }
    println(n)
}