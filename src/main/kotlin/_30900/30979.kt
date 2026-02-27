package _30900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val n = readLine().toInt()
    println("Padaeng_i " + if (StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.sum() } >= t) "Happy" else "Cry")
}