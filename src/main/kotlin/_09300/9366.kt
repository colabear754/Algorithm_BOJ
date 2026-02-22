package _09300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    for (i in 1..readLine().toInt()) {
        bw.write("Case #$i: ")
        val (a, b, c) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        bw.appendLine(when {
            a == b && b == c -> "equilateral"
            a + b <= c || a + c <= b || b + c <= a -> "invalid!"
            a == b || b == c || a == c -> "isosceles"
            else -> "scalene"
        })
    }
    bw.close()
}