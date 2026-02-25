package _11500

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = IntArray(readLine().toInt()) { readLine().toInt() }
    val max = cases.max()
    val isPrime = BooleanArray(max + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..sqrt(max.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..max step i)
                isPrime[j] = false
        }
    }
    cases.forEach {
        val remain = it - 3
        for (i in 2..remain / 2) {
            if (isPrime[i] && isPrime[remain - i]) {
                bw.appendLine(intArrayOf(3, i, remain - i).apply { sort() }.joinToString(" "))
                break
            }
        }
    }
    bw.close()
}