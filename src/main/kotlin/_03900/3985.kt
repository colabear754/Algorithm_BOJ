package _03900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val l = readLine().toInt()
    val n = readLine().toInt()
    val rollCakes = IntArray(l + 1)
    val expects = IntArray(n + 1)
    repeat(n) { i ->
        val (start, end) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        (start..end).forEach { if (rollCakes[it] == 0) rollCakes[it] = i + 1 }
        expects[i + 1] = end - start + 1
    }
    println("${(1..n).maxBy { expects[it] }}\n${(1..n).maxBy { rollCakes.count { v -> v == it } }}")
}