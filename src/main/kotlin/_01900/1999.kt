package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, b, k) = readLine().split(" ").map { it.toInt() }
    val matrix = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val size = n - b + 1
    val minimums = Array(n) { matrix[it].copyOf() }
    val maximums = Array(n) { matrix[it].copyOf() }
    for (i in 0..<n) {
        for (j in 0..<size) {
            for (d in 1..<b) {
                minimums[i][j] = minOf(minimums[i][j], minimums[i][j + d])
                maximums[i][j] = maxOf(maximums[i][j], maximums[i][j + d])
            }
        }
    }
    for (i in 0..<size) {
        for (j in 0..<n) {
            for (d in 1..<b) {
                minimums[i][j] = minOf(minimums[i][j], minimums[i + d][j])
                maximums[i][j] = maxOf(maximums[i][j], maximums[i + d][j])
            }
        }
    }
    val differences = Array(size) { i -> IntArray(size) { j -> maximums[i][j] - minimums[i][j] } }
    repeat(k) {
        val (i, j) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() - 1 } }
        bw.appendLine("${differences[i][j]}")
    }
    bw.close()
}