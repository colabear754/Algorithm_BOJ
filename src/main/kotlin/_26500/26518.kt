package _26500

import kotlin.math.abs
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (b, c, a1, a2) = readLine().split(" ").map { it.toDouble() }
    val sqrtD = sqrt(b * b + 4 * c)
    val root1 = (b + sqrtD) / 2.0
    val root2 = (b - sqrtD) / 2.0
    println(if (abs(a2 - root1 * a1) > 1e-9 || (abs(a2 - root2 * a1) > 1e-9 && abs(root1) >= abs(root2))) root1 else root2)
}