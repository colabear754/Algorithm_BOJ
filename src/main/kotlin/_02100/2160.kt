package _02100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pictures = Array(n) { CharArray(35) }
    repeat(n) { i ->
        repeat(5) { j -> readLine().toCharArray().copyInto(pictures[i], j * 7) }
    }
    var min = Int.MAX_VALUE
    val minIndex = intArrayOf(0, 0)
    for (i in 0..<n) {
        for (j in i + 1..<n) {
            var difference = 0
            for (k in 0..34) {
                if (pictures[i][k] != pictures[j][k]) difference++
            }
            if (difference < min) {
                min = difference
                minIndex[0] = i + 1
                minIndex[1] = j + 1
            }
        }
    }
    println(minIndex.joinToString(" "))
}