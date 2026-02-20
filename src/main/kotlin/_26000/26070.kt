package _26000

fun main() = with(System.`in`.bufferedReader()) {
    var (a, b, c) = readLine().split(" ").map { it.toLong() }
    var (x, y, z) = readLine().split(" ").map { it.toLong() }
    var result = 0L
    repeat(3) {
        result += minOf(a, x).also { a -= it; x -= it }
        result += minOf(b, y).also { b -= it; y -= it }
        result += minOf(c, z).also { c -= it; z -= it }
        val nextX = x % 3 + z / 3
        val nextY = y % 3 + x / 3
        val nextZ = z % 3 + y / 3
        x = nextX
        y = nextY
        z = nextZ
    }
    println(result)
}