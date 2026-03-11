package _25700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (w, n) = readLine().split(" ").let { it[0][0] to it[1].toInt() }
    val array = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    for (i in 0..<n / 2) {
        for (j in 0..<n) {
            when (w) {
                'L', 'R' -> array[j][i] = array[j][n - 1 - i].also { array[j][n - 1 - i] = array[j][i] }
                'U', 'D' -> array[i][j] = array[n - 1 - i][j].also { array[n - 1 - i][j] = array[i][j] }
            }
        }
    }
    println(array.joinToString("\n") { it.joinToString(" ") { num -> when (num) {
        1 -> "1"
        2 -> "5"
        5 -> "2"
        8 -> "8"
        else -> "?"
    } } })
}