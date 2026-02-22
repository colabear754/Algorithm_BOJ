package _27900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, a, b) = readLine().split(" ").map { it.toInt() }
    val visited = BooleanArray(n + 1)
    repeat(m) { StringTokenizer(readLine()).run { for (i in nextToken().toInt()..nextToken().toInt()) visited[i] = true } }
    val queue = ArrayDeque<Magic>().apply { add(Magic(0, 0)) }
    val magics = intArrayOf(a, b)
    while (queue.isNotEmpty()) {
        val (dogs, count) = queue.removeFirst()
        if (dogs >= n) {
            return@with println(count)
        }
        for (i in 0..1) {
            val nextDogs = dogs + magics[i]
            if (nextDogs <= n && !visited[nextDogs]) {
                visited[nextDogs] = true
                queue.add(Magic(nextDogs, count + 1))
            }
        }
    }
    println(-1)
}

private data class Magic(val dogs: Int, val count: Int)