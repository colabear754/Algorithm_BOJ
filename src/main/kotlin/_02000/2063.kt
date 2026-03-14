package _02000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        if (n < 2) return@repeat bw.write("NO\n").also { readLine() }
        val r = StringTokenizer(readLine()).run { LongArray(n) { nextToken().replace(".", "").toLong() } }.apply { sort() }
        var sum = 0L
        for (radius in r) {
            if (radius <= sum) return@repeat bw.write("YES\n")
            sum += radius
        }
        bw.write("NO\n")
    }
    bw.close()
}