package _25500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val workingHours = mutableMapOf<String, Int>()
    repeat(n) {
        StringTokenizer(readLine()).run { repeat(7) { nextToken().takeIf { it != "-" }?.let { workingHours[it] = (workingHours[it] ?: 0) + 4 } } }
        StringTokenizer(readLine()).run { repeat(7) { nextToken().takeIf { it != "-" }?.let { workingHours[it] = (workingHours[it] ?: 0) + 6 } } }
        StringTokenizer(readLine()).run { repeat(7) { nextToken().takeIf { it != "-" }?.let { workingHours[it] = (workingHours[it] ?: 0) + 4 } } }
        StringTokenizer(readLine()).run { repeat(7) { nextToken().takeIf { it != "-" }?.let { workingHours[it] = (workingHours[it] ?: 0) + 10 } } }
    }
    var min = Int.MAX_VALUE
    var max = 0
    workingHours.values.forEach { min = minOf(min, it); max = maxOf(max, it) }
    println(if (max - min <= 12) "Yes" else "No")
}