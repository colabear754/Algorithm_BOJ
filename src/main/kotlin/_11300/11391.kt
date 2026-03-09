package _11300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val pairCount = 1 shl (n - k - 1)
    val limit = (1 shl n) - 1
    var current = 0
    repeat(1 shl k) {
        repeat(pairCount) { bw.write("$current ${limit - current++} ") }
        bw.newLine()
    }
    bw.close()
}