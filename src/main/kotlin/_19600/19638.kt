package _19600

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val (n, h, t) = readLine().split(" ").map { it.toInt() }
    val giants = PriorityQueue<Int>(reverseOrder())
    repeat(n) { readLine().toInt().let { if (it >= h) giants.add(it) } }
    if (giants.isEmpty()) return@with println("YES\n0")
    var count = 0
    repeat(t) {
        giants.add(maxOf(1, giants.poll() shr 1))
        count++
        if (giants.peek() < h) return@with println("YES\n$count")
    }
    println("NO\n${giants.peek()}")
}