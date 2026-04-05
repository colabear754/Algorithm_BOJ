package _26600

fun main() = with(System.`in`.bufferedReader()) {
    println(when (readLine().toInt()) {
        in 200..205 -> 1
        in 206..217 -> 2
        in 218..228 -> 3
        else -> 4
    })
}