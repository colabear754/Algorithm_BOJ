package _24300

fun main() = with(System.`in`.bufferedReader()) {
    val (a2, a1, a0) = readLine().split(" ").map { it.toInt() }
    val (c1, c2) = readLine().split(" ").map { it.toInt() }
    val n0 = readLine().toInt()
    println(if (isValid(a2 - c1, a1, a0, n0) && isValid(c2 - a2, -a1, -a0, n0)) 1 else 0)
}

private fun isValid(a: Int, b: Int, c: Int, n0: Int): Boolean {
    if (a < 0) return false
    if (a == 0) {
        if (b < 0) return false
        return b * n0 + c >= 0
    }
    if (2 * a * n0 + b >= 0) return a * n0 * n0 + b * n0 + c >= 0
    return b * b - 4 * a * c <= 0
}