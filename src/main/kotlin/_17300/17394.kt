package _17300

import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = Array(readLine().toInt()) { StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } } }
    val max = cases.maxOf { it.last() }
    val isPrime = BooleanArray(max + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..sqrt(max.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..max step i) isPrime[j] = false
        }
    }
    val primeCount = IntArray(max + 1)
    var currentPrimeCount = 0
    for (i in 2..max) {
        if (isPrime[i]) currentPrimeCount++
        primeCount[i] = currentPrimeCount
    }
    val count = IntArray(maxOf(max, cases.maxOf { it.first() }) + 1)
    for (case in cases) {
        val (n, a, b) = case
        if (primeCount[b] - primeCount[a - 1] <= 0) {
            bw.write("-1\n")
            continue
        }
        count.fill(-1)
        count[n] = 0
        val queue = ArrayDeque<Int>().apply { add(n) }
        val searchRange = 2..maxOf(n, b)
        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            if (current in a..b && isPrime[current]) {
                bw.appendLine("${count[current]}")
                break
            }
            val nexts = intArrayOf(current / 2, current / 3, current + 1, current - 1)
            for (next in nexts) {
                if (next in searchRange && count[next] == -1) {
                    count[next] = count[current] + 1
                    queue.add(next)
                }
            }
        }
    }
    bw.close()
}