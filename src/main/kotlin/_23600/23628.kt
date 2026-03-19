package _23600

fun main() = with(System.`in`.bufferedReader()) {
    val start = readLine().split(" ").map { it.toInt() }.toIntArray()
    val end = readLine().split(" ").map { it.toInt() }.toIntArray()
    val days = (end[0] - start[0]) * 360 + (end[1] - start[1]) * 30 + (end[2] - start[2])
    println("${(days / 360).let { it * it + 58 * it + 1 } / 4} ${minOf(36, days / 30)}\n${days}days")
}