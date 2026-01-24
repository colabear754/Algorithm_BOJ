package _34500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = IntArray(n)
    var left = 1
    var right = n
    for (i in 1..n) {
        array[n - i] = if (i and 1 == 0) left++ else right--
    }
    println(array.joinToString(" "))
}