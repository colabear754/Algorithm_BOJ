package _26000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val isPrime = BooleanArray(1000001) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..1000) {
        if (isPrime[i]) {
            for (j in i * i..1000000 step i) isPrime[j] = false
        }
    }
    val n = readLine().toInt()
    val sum = IntArray(n + 1)
    StringTokenizer(readLine()).run { for (i in 1..n) sum[i] = sum[i - 1] + nextToken().toInt() }
    var count = 0
    for (i in 0..n) {
        for (j in 2..n - i) {
            if (!isPrime[j]) continue
            if (isPrime[sum[i + j] - sum[i]]) count++
        }
    }
    println(count)
}