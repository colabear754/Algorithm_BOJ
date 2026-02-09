package _33600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val sauce = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    if (sauce.max() > k) return@with println(0)
    val min = sauce.min()
    if (min <= 0) return@with println(-1)
    var count = 0L
    sauce.forEach { count += (k - it) / min }
    count -= (k - min) / min - 1
    println(count)
}