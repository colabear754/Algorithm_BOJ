package _29300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val competencies = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }.apply { sortDescending() }
    var sum = 0L
    var last = 0L
    var index = 0
    repeat(m) {
        val (t, q) = StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } }
        last = t
        while (sum < q) {
            if (index >= n) return@with println(-1)
            sum += competencies[index++] + t
        }
    }
    (index..<n).forEach { sum += competencies[it] + last }
    println(sum)
}