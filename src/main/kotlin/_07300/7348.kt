package _07300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val corridor = IntArray(201)
        repeat(n) {
            val (s, t) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
            for (i in (minOf(s, t) + 1) / 2..(maxOf(s, t) + 1) / 2) corridor[i]++
        }
        bw.appendLine("${corridor.max() * 10}")
    }
    bw.close()
}