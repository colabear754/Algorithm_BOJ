package _28000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (x, y) = readLine().split(" ").map { it.toInt() }
    var result = 4
    if (x == 1) result--
    if (x == n) result--
    if (y == 1) result--
    if (y == n) result--
    println(result)
}