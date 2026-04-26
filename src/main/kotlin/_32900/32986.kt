package _32900

fun main() = with(System.`in`.bufferedReader()) {
    val (x, y, z) = readLine().split(" ").map { it.toInt() }
    if (x == y && y == z && z == 3) return@with println(0)
    println((minOf(x, y, z) - 1) / 2)
}