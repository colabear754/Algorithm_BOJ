package _15900

fun main() = with(System.`in`.bufferedReader()) {
    val string = readLine()
    var index = 0
    for (char in string) {
        if (index == 4) break
        if (char == "UCPC"[index]) index++
    }
    println("I ${if (index == 4) "love" else "hate"} UCPC")
}