package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, w, h) = readLine().split(" ").map { it.toInt() }
    val diagonal = w * w + h * h
    repeat(n) { bw.appendLine(if (readLine().toInt().let { it * it } <= diagonal) "DA" else "NE") }
    bw.close()
}