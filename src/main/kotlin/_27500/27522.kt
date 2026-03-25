package _27500

fun main() = with(System.`in`.bufferedReader()) {
    val records = Array(8) { readLine().split(" ") }.apply { sortBy { it[0] } }
    val scores = intArrayOf(10, 8, 6, 5, 4, 3, 2, 1)
    var red = 0
    var blue = 0
    for (i in 0..7) {
        if (records[i][1] == "R") red += scores[i]
        else blue += scores[i]
    }
    println(if (red > blue) "Red" else "Blue")
}