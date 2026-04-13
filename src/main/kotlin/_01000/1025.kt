package _01000

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val table = Array(n) { readLine().map { it - '0' }.toIntArray() }
    var max = -1
    for (i in 0..<n) {
        for (j in 0..<m) {
            for (k in -n..<n) {
                for (l in -m..<m) {
                    if (k == 0 && l == 0) {
                        if (table[i][j].isSquare()) max = maxOf(max, table[i][j])
                        continue
                    }
                    var r = i
                    var c = j
                    var number = 0
                    while (r in 0..<n && c in 0..<m) {
                        number = number * 10 + table[r][c]
                        if (number.isSquare()) max = maxOf(max, number)
                        r += k
                        c += l
                    }
                }
            }
        }
    }
    println(max)
}

private fun Int.isSquare(): Boolean {
    val sqrt = sqrt(toDouble()).toInt()
    return sqrt * sqrt == this
}