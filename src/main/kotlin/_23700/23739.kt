package _23700

fun main() = with(System.`in`.bufferedReader()) {
    val t = IntArray(readLine().toInt()) { readLine().toInt() }
    var count = 0
    var timeRemaining = 30
    for (time in t) {
        if ((time + 1) / 2 <= timeRemaining) count++
        timeRemaining -= time
        if (timeRemaining <= 0) timeRemaining = 30
    }
    println(count)
}