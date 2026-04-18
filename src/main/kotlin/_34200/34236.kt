package _34200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val maze = Array(n) { readLine().toCharArray() }
    var sr = -1
    var sc = -1
    for (i in 0..<n) {
        for (j in 0..<m) {
            if (maze[i][j] == 'S') {
                sr = i
                sc = j
                break
            }
        }
    }
    val dr = intArrayOf(-1, 0, 1, 0)
    val dc = intArrayOf(0, 1, 0, -1)
    var sDirection = -1
    for (i in 0..<4) {
        val nr = sr + dr[i]
        val nc = sc + dc[i]
        if (nr in 0..<n && nc in 0..<m && maze[nr][nc] != '*') {
            sDirection = i
        }
    }
    fun simulate(isLeft: Boolean): Int {
        var r = sr
        var c = sc
        var direction = sDirection
        var count = 0
        while (maze[r][c] != 'E') {
            direction = if (isLeft) (direction + 3) % 4 else (direction + 1) % 4
            while (true) {
                val nr = r + dr[direction]
                val nc = c + dc[direction]
                if (nr in 0..<n && nc in 0..<m && maze[nr][nc] != '*') {
                    r = nr
                    c = nc
                    count++
                    break
                }
                direction = if (isLeft) (direction + 1) % 4 else (direction + 3) % 4
            }
        }
        return count
    }
    val left = simulate(true)
    val right = simulate(false)
    println(when {
        left < right -> "LEFT IS BEST"
        left > right -> "RIGHT IS BEST"
        else -> "SAME"
    })
}