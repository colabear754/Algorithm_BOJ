package _12900

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    val t = readLine()
    var left = 0
    var right = t.length - 1
    var isReversed = false
    while (right - left + 1 > s.length) {
        if ((if (isReversed) t[left++] else t[right--]) == 'B') {
            isReversed = !isReversed
        }
    }
    println(if (s == t.slice(left..right).let { if (isReversed) it.reversed() else it }) 1 else 0)
}