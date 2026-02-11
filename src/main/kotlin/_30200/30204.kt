package _30200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, x) = readLine().split(" ").map { it.toInt() }
    var sum = 0
    StringTokenizer(readLine()).run { repeat(n) { sum += nextToken().toInt() } }
    println(if (sum % x == 0) 1 else 0)
}