package _24800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        graph[a].add(b)
        graph[b].add(a)
    }
    graph.forEach { it.sortDescending() }
    val visited = BooleanArray(n + 1)
    val depth = IntArray(n + 1)
    val time = IntArray(n + 1)
    var currentTime = 1
    fun dfs(node: Int, edges: List<Int>, currentDepth: Int) {
        if (visited[node]) return
        visited[node] = true
        depth[node] = currentDepth
        time[node] = currentTime++
        edges.forEach { dfs(it, graph[it], currentDepth + 1) }
    }
    dfs(r, graph[r], 0)
    println((1..n).sumOf { 1L * depth[it] * time[it] })
}