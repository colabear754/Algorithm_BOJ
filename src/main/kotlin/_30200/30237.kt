package _30200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val allUnion = mutableSetOf<Int>()
        val sets = Array(n) { StringTokenizer(readLine()).run { mutableSetOf<Int>().apply { repeat(nextToken().toInt()) { add(nextToken().toInt().also { allUnion.add(it) }) } } } }
        var max = 0
        for (excluded in allUnion) {
            val current = mutableSetOf<Int>()
            for (set in sets) {
                if (excluded !in set) current.addAll(set)
            }
            max = maxOf(max, current.size)
        }
        bw.appendLine("$max")
    }
    bw.close()
}