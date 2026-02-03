package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    var current = n
    var count = 0
    while (current.countOneBits() > k) {
        current += (current and -current).also { count += it }
    }
    println(count)
}