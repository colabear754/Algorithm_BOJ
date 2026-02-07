package _20100

fun main() = with(System.`in`.bufferedReader()) {
    val (h, n) = readLine().split(" ").map { it.toInt() }
    val destination = kotlin.math.abs(h - n)
    var result = 1L
    for (i in 0..<destination) {
        result *= 4 * i + 2
        result /= i + 2
    }
    println(result)
}