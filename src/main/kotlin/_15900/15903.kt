package _15900

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val cards = PriorityQueue<Long>()
    StringTokenizer(readLine()).run { repeat(n) { cards.add(nextToken().toLong()) } }
    repeat(m) {
        val sum = cards.poll() + cards.poll()
        repeat(2) { cards.add(sum) }
    }
    println(cards.sum())
}