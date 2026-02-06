package _07600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var input: String
    while (readLine().also { input = it } != "0") {
        var n = input.toInt()
        var length = 1
        var count = 9
        while (n > count) {
            n -= count
            count *= 11 - ++length
        }
        var result = 0
        val usedNumber = BooleanArray(10)
        for (i in 0..<length) {
            var permutation = 1
            for (j in 0..<length - 1 - i) {
                permutation *= 9 - i - j
            }
            for (j in 0..9) {
                if ((i == 0 && j == 0) || usedNumber[j]) continue
                if (n > permutation) {
                    n -= permutation
                    continue
                }
                result = result * 10 + j
                usedNumber[j] = true
                break
            }
        }
        bw.appendLine("$result")
    }
    bw.close()
}