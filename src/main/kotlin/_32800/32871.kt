package _32800

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, m) = readLine().split(" ").map { it.toLong() }
        bw.write(if (n == 1L || m == 1L || (n + m) and 1 != 0L) "YES\n" else "NO\n")
    }
    bw.close()
}