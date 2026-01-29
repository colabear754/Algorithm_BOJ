package _18300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").run { first().toInt() to last().toLong() }
    val courseLength = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val distances = LongArray(2 * n + 1)
    for (i in 0..<n) distances[i + 1] = distances[i] + courseLength[i]
    for (i in 1..n) distances[n + i] = distances[n + i - 1] + courseLength[n - i]
    val currentIndex = distances.binarySearch(k).let { if (it < 0) -(it + 2) else it }
    println(currentIndex.let { if (it < n) it + 1 else if (it > n) 2 * n - it else n })
}