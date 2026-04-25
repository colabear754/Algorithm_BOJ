package _01100

import java.util.LinkedList
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val peopleCount = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val lineOrder = LinkedList<Int>()
    for (i in n - 1 downTo 0) {
        lineOrder.add(peopleCount[i], i + 1)
    }
    println(lineOrder.joinToString(" "))
}