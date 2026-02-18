package _03500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var minArea = Int.MAX_VALUE
    var horizontal = 1
    var vertical = 1
    var height = n
    for (i in 1..kotlin.math.cbrt(n.toDouble()).toInt()) {
        if (n % i != 0) continue
        val side = n / i
        for (j in i..kotlin.math.sqrt(side.toDouble()).toInt()) {
            if (side % j != 0) continue
            val k = n / (i * j)
            val area = 2 * (i * j + j * k + k * i)
            if (area < minArea) {
                minArea = area
                horizontal = i
                vertical = j
                height = k
            }
        }
    }
    println("$horizontal $vertical $height")
}