package _31800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val serim = ArrayDeque<Int>()
    val sungju = ArrayDeque<Int>()
    val start = if (n % 3 == 1) 2 else 1
    for (i in n downTo start) {
        if ((n - i) % 3 != 0) serim.addFirst(i)
        else sungju.addFirst(i)
    }
    println("${serim.size}\n${serim.joinToString(" ")}\n${sungju.size}\n${sungju.joinToString(" ")}")
}