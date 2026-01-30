package _09700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val factorial = IntArray(11) { 1 }
    for (i in 2..10) factorial[i] = factorial[i - 1] * i
    lateinit var input: String
    while (readLine()?.also { input = it }?.run { !isNullOrEmpty() } ?: false) {
        val (string, n) = StringTokenizer(input).run { nextToken() to nextToken().toInt() }
        bw.write("$string $n = ")
        val length = string.length
        if (n > factorial[length]) {
            bw.appendLine("No permutation")
            continue
        }
        val charList = string.toMutableList()
        var target = n - 1
        for (i in length - 1 downTo 0) {
            bw.write("${charList.removeAt(target / factorial[i])}")
            target %= factorial[i]
        }
        bw.newLine()
    }
    bw.close()
}