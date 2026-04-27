package _34000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val first = readLine().toInt()
    var max = first
    var min = first
    repeat(n - 1) {
        readLine().toInt().let {
            max = maxOf(max, it)
            min = minOf(min, it)
        }
    }
    println(if (first == min) "ez" else if (first == max) "hard" else "?")
}