package _17200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, l, k) = readLine().split(" ").map { it.toInt() }
    val problems = Array(n) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }.sortedArrayWith(compareBy({ it[1] }, { it[0] }))
    var score = 0
    var solved = 0
    for (problem in problems) {
        if (solved == k) break
        val (easy, hard) = problem
        if (hard <= l) score += 140.also { solved++ }
        else if (easy <= l) score += 100.also { solved++ }
    }
    println(score)
}