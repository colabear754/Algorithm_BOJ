package _17100

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) { readLine().toCharArray() }
    val (familyR, familyC) = map.indices.firstNotNullOf { i -> map[i].indexOf('2').let { if (it != -1) i to it else null } }
    val queue = ArrayDeque<Move>()
    queue.add(Move(familyR, familyC, 0))
    val visited = Array(n) { BooleanArray(m) }
    visited[familyR][familyC] = true
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    while (queue.isNotEmpty()) {
        val (r, c, count) = queue.removeFirst()
        if (map[r][c] > '2') {
            return@with println("TAK\n$count")
        }
        for (i in 0..3) {
            val nr = r + dr[i]
            val nc = c + dc[i]
            if (nr in 0..<n && nc in 0..<m && !visited[nr][nc] && map[nr][nc] != '1') {
                visited[nr][nc] = true
                queue.add(Move(nr, nc, count + 1))
            }
        }
    }
    println("NIE")
}

private data class Move(val r: Int, val c: Int, val count: Int)