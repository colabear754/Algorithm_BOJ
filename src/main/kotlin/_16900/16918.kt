package _16900

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c, n) = readLine().split(" ").map { it.toInt() }
    if (n and 1 == 0) {
        return@with println(StringBuilder("O".repeat(c)).append('\n').repeat(r))
    }
    val board = Array(r) { readLine().toCharArray() }
    if (n == 1) return@with println(board.joinToString("\n") { it.joinToString("") } )
    println(board.boom(r, c).run { if (n % 4 == 1) boom(r, c) else this }.joinToString("\n") { it.joinToString("") })
}

private fun Array<CharArray>.boom(r: Int, c: Int) = Array(r) { CharArray(c) { 'O' } }.also {
    val dr = intArrayOf(0, 0, 1, -1)
    val dc = intArrayOf(1, -1, 0, 0)
    for (i in 0..<r) {
        for (j in 0..<c) {
            if (this[i][j] == '.') continue
            it[i][j] = '.'
            for (k in 0..3) {
                val nextR = i + dr[k]
                val nextC = j + dc[k]
                if (nextR in 0..<r && nextC in 0..<c) {
                    it[nextR][nextC] = '.'
                }
            }
        }
    }
}