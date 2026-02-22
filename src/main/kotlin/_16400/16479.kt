package _16400

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toDouble()
    val (d1, d2) = readLine().split(" ").map { it.toDouble() }
    println(k.pow(2) - (d1 - d2).pow(2) / 4)
}