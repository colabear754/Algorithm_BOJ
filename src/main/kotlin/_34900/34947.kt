package _34900

import java.util.StringTokenizer
import kotlin.math.PI
import kotlin.math.cos

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = StringTokenizer(readLine()).run { DoubleArray(2) { nextToken().toDouble() } }
    val (_, _, theta, w) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
    val radian = theta * PI / 180.0
    println((w / 25.0 * (radian + 2.0 * cos(radian / 2.0)) * n / t).let { "$it\n${it / 2.0}" })
}