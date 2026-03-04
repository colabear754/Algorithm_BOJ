package _03200

import kotlin.math.ceil

fun main() = with(System.`in`.bufferedReader()) {
    val counts = IntArray(3)
    repeat(readLine().toInt()) {
        when (readLine()) {
            "1/2" -> counts[0]++
            "1/4" -> counts[1]++
            "3/4" -> counts[2]++
        }
    }
    println(counts[2] + ceil(maxOf(0, counts[1] - counts[2]) / 4.0 + counts[0] / 2.0).toInt())
}