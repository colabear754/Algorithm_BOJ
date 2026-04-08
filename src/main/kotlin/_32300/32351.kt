package _32300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, s0, k) = readLine().split(" ").let { Triple(it[0].toInt(), it[1].toDouble(), it[2].toInt()) }
    val mutations = Array(k) { StringTokenizer(readLine()).run { nextToken().toInt() to nextToken().toDouble() } }
    var sum = 0.0
    var currentM = 1
    var currentS = s0
    for ((m, s) in mutations) {
        sum += (m - currentM) * 4 * 60 / currentS
        currentM = m
        currentS = s
    }
    println(sum + (n + 1 - currentM) * 4 * 60 / currentS)
}