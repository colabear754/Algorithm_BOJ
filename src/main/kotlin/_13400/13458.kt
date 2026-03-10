package _13400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val takers = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    val (b, c) = StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } }
    println(takers.sumOf { 1 + (maxOf(0, it - b) + c - 1) / c })
}