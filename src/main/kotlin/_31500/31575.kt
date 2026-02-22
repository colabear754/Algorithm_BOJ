package _31500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map(String::toInt)
    val city = Array(m) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val queue = ArrayDeque<Point>().apply { add(Point(0, 0)) }
    city[0][0] = -1
    val dr = intArrayOf(0, 1)
    val dc = intArrayOf(1, 0)
    while  (queue.isNotEmpty()) {
        val (r, c) = queue.removeFirst()
        if (r == m - 1 && c == n - 1) {
            return@with println("Yes")
        }
        for (i in 0..1) {
            val nr = r + dr[i]
            val nc = c + dc[i]
            if (nr in 0..<m && nc in 0..<n && city[nr][nc] == 1) {
                city[nr][nc] = -1
                queue.add(Point(nr, nc))
            }
        }
    }
    println("No")
}

private data class Point(val r: Int, val c: Int)