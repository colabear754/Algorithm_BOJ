package _03200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cards = IntArray(n) { readLine().toInt() }
    val positions = IntArray(n + 1)
    for (i in cards.indices) {
        positions[cards[i]] = i
    }
    var count = 0
    for (i in 2..n) {
        if (positions[i] < positions[i - 1]) count++
    }
    println(count)
}