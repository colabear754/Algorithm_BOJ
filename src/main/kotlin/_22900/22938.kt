package _22900

fun main() = with(System.`in`.bufferedReader()) {
    val (x1, y1, r1) = readLine().split(" ").map { it.toLong() }
    val (x2, y2, r2) = readLine().split(" ").map { it.toLong() }
    println(if ((x1 - x2).let { it * it } + (y1 - y2).let { it * it } < (r1 + r2).let { it * it } ) "YES" else "NO" )
}