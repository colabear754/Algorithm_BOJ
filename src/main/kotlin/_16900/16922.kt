package _16900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    println(
        if (n < 12) {
            val sums = mutableSetOf<Int>()
            for (i in 0..n) {
                for (j in 0..n - i) {
                    for (k in 0..n - i - j) {
                        sums.add(n + 4 * i + 9 * j + 49 * k)
                    }
                }
            }
            sums.size
        } else 49 * n - 247
    )
}