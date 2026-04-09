package _33500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, _, a, b) = readLine().toIntArray(4)
    val timeTable = readLine().toIntArray(n)
    val like = readLine().toIntArray(a).toSet()
    val hate = readLine().toIntArray(b).toSet()
    var result = 0
    var likeStreak = 0
    var hateStreak = 0
    for (time in timeTable) {
        if (time in like) {
            likeStreak++
            hateStreak = 0
            if (likeStreak == 3) result += likeStreak else if (likeStreak > 3) result++
            continue
        }
        if (time in hate) {
            hateStreak++
            likeStreak = 0
            if (hateStreak == 3) result -= hateStreak else if (hateStreak > 3) result--
            continue
        }
        likeStreak = 0
        hateStreak = 0
    }
    println(result)
}

private fun String.toIntArray(size: Int) = StringTokenizer(this).run { IntArray(size) { nextToken().toInt() } }