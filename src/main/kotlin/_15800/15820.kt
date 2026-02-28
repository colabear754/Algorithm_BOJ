package _15800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (s1, s2) = readLine().split(" ").map { it.toInt() }
    repeat(s1) { StringTokenizer(readLine()).run {
        if (nextToken().toInt() != nextToken().toInt()) return@with println("Wrong Answer")
    } }
    repeat(s2) { StringTokenizer(readLine()).run {
        if (nextToken().toInt() != nextToken().toInt()) return@with println("Why Wrong!!!")
    } }
    println("Accepted")
}