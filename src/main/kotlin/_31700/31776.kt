package _31700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var count = 0
    repeat(readLine().toInt()) {
        val t = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt().let { if (it == -1) 200 else it } } }
        if (t.all { it == 200 }) return@repeat
        if (t[1] in t[0]..t[2]) count++
    }
    println(count)
}