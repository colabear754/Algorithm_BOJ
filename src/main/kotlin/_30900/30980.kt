package _30900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val problems = mutableListOf<Problem>()
    repeat(n) {
        readLine()
        StringTokenizer(readLine(), ".+=").run { repeat(countTokens() / 3) { problems.add(Problem(nextToken().toInt(), nextToken().toInt(), nextToken().toInt())) } }
        readLine()
    }
    for (i in 0..<n * m step m) {
        repeat(m) { bw.write(".${problems[i + it].line(true)}") }
        bw.newLine()
        repeat(m) { bw.write("${problems[i + it]}") }
        bw.newLine()
        repeat(m) { bw.write(".${problems[i + it].line(false)}") }
        bw.newLine()
    }
    bw.close()
}

private class Problem(val a: Int, val b: Int, val c: Int) {
    val isCorrect = a + b == c
    fun line(isStart: Boolean) = if (isCorrect) "*".repeat(if (c > 9) 6 else 5).padEnd(7, '.') else if (isStart) "../...." else "/......"
    override fun toString(): String {
        val str = if (isCorrect) "*$a+$b=$c*" else ".$a/$b=$c"
        return str.padEnd(8, '.')
    }
}