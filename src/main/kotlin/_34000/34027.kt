package _34000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        bw.appendLine(if (kotlin.math.sqrt(n.toDouble()).toInt().let { it * it == n }) "1" else "0")
    }
    bw.close()
}