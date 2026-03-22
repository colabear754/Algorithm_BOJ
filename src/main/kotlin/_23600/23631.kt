package _23600

import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, k) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        val totalDistance = n - 1
        val completeStep = (sqrt(1.0 + 8 * totalDistance / k).toInt() - 1) / 2
        val remainingDistance = totalDistance - k * completeStep * (completeStep + 1) / 2
        val lastPosition = k * if (completeStep and 1 == 0) -completeStep / 2 else (completeStep + 1) / 2
        bw.appendLine(if ((completeStep + 1) and 1 == 0) "${lastPosition - remainingDistance} L" else "${lastPosition + remainingDistance} R")
    }
    bw.close()
}