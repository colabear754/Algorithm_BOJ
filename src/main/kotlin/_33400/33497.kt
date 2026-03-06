package _33400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val morning = IntArray(m)
    val skipLimit = IntArray(m)
    var skipLimitSum = 0
    repeat(m) { StringTokenizer(readLine()).run {
        morning[it] = nextToken().toInt()
        val skipMax = n - morning[it] - nextToken().toInt()
        if (skipMax < 0) return@with println("NO")
        skipLimit[it] = skipMax
        skipLimitSum += skipMax
    } }
    if (skipLimitSum < n) return@with println("NO")
    val skipCount = IntArray(m)
    var skipable = n
    for (i in 0..<m) {
        val skip = minOf(skipLimit[i], skipable)
        skipCount[i] = skip
        skipable -= skip
    }
    val result = Array(n) { CharArray(m) }
    var current = 0
    for (i in 0..<m) {
        repeat(skipCount[i]) { result[current++][i] = 'X' }
    }
    for (i in 0..<m) {
        var morningCount = morning[i]
        for (j in 0..<n) {
            if (result[j][i] == 'X') continue
            if (morningCount > 0) {
                result[j][i] = '+'
                morningCount--
                continue
            }
            result[j][i] = '-'
        }
    }
    println("YES\n${result.joinToString("\n") { String(it) }}")
}