package _23800

fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    val even = "@".repeat(5 * n)
    val odd = "@".repeat(n)
    repeat(n) { appendLine(even) }
    repeat(n) { appendLine(odd) }
    repeat(n) { appendLine(even) }
    repeat(n) { appendLine(odd) }
    repeat(n) { appendLine(even) }
    close()
}