package _30000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val rooms = IntArray(n + 1)
    repeat(m) {
        StringTokenizer(readLine()).run {
            val k = nextToken().toInt()
            if (rooms[k] <= nextToken().toInt()) {
                rooms[k] = nextToken().toInt()
                bw.appendLine("YES")
                return@repeat
            }
            bw.appendLine("NO")
        }
    }
    bw.close()
}