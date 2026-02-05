package _13700

import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toBigInteger()
    if (n == BigInteger.ONE) return@with println(1)
    var low = BigInteger.ONE
    var high = n
    var result = BigInteger.ZERO
    while (low <= high) {
        val mid = (low + high) shr 1
        (mid * mid).also { when {
            it == n -> return@with println(mid)
            it < n -> result = mid.also { low = mid + BigInteger.ONE }
            else -> high = mid - BigInteger.ONE
        } }
    }
    println(result)
}