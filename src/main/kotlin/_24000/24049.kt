package _24000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val left = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val top = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
    var result = 0
    val combinationBase = n + m - 2
    fun IntArray.move(index: Int, length: Int) {
        val externalValue = this[index]
        if ((combinationBase - index) and length == length) {
            result = result xor externalValue
        }
    }
    repeat(n) { left.move(it, m - 1) }
    repeat(m) { top.move(it, n - 1) }
    println(result)
}