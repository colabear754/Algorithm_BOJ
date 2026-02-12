package _34900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, coupon) = readLine().split(" ").let { it[0].toInt() to it[1] }
    val cost = readLine()
    if (cost.length > n) return@with println(-1)
    if (cost.length < n) return@with println(coupon.replace("?", "1"))
    val biggestCoupon = coupon.replace("?", "9")
    for (i in 0..<n) {
        if (biggestCoupon[i] > cost[i]) break
        if (cost[i] > biggestCoupon[i]) return@with println(-1)
    }
    println(biggestCoupon)
}