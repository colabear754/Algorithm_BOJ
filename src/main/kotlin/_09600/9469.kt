package _09600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { StringTokenizer(readLine()).run {
        val t = nextToken().toInt()
        val (d, a, b, f) = DoubleArray(4) { nextToken().toDouble() }
        bw.appendLine("$t ${d * f / (a + b)}")
    } }
    bw.close()
}