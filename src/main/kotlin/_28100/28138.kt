package _28100

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (n, r) = readLine().split(" ").map { it.toLong() }
    var sum = 0L
    val target = n - r
    val sqrt = sqrt(target.toDouble()).toLong()
    for (i in 1..sqrt) {
        if (target % i != 0L) continue
        if (i > r) sum += i
        (target / i).also { if (it > r && it != i) sum += it }
    }
    println(sum)
}