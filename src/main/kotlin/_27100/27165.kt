package _27100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var countOne = 0
    var oneIndex = -1
    val pieces = StringTokenizer(readLine()).run { IntArray(n + 1) { i -> nextToken().toInt().also { if (it == 1) { countOne++; oneIndex = i } } } }
    val x = readLine().toInt()
    when (countOne) {
        0 -> for (i in 0..n - x) if (pieces[i] >= 3 && pieces[i + x] != 0) return@with println("YES\n$i ${i + x}")
        1 -> if (oneIndex >= x && pieces[oneIndex - x] >= 3) return@with println("YES\n${oneIndex - x} $oneIndex") else if (oneIndex < n - x && pieces[oneIndex + x] >= 2) return@with println("YES\n$oneIndex ${oneIndex + x}")
        2 -> if (oneIndex >= x && pieces[oneIndex - x] == 1) return@with println("YES\n${oneIndex - x} $oneIndex")
    }
    println("NO")
}