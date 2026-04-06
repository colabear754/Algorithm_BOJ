package _05100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var case = 1
    var n: Int
    while (readLine().also { n = it.toInt() } != "0") {
        val manito = mutableMapOf<String, String>()
        repeat(n) {
            val (a, b) = readLine().split(" ")
            manito[a] = b
        }
        val visited = mutableSetOf<String>()
        var count = 0
        for (start in manito.keys) {
            if (!visited.add(start)) continue
            count++
            var current = manito[start]!!
            while (current != start) {
                visited.add(current)
                current = manito[current]!!
            }
        }
        bw.appendLine("${case++} $count")
    }
    bw.close()
}