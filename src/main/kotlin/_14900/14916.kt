package _14900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var coins = n / 5
    var change = n % 5
    while (change in 1..n) {
        if (change % 2 != 0) {
            coins--
            change += 5
            continue
        }
        coins += change / 2
        change = 0
    }
    println(if (change > n) -1 else coins)
}