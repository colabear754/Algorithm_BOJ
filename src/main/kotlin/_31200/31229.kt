package _31200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    for (i in 1..n) bw.write("${2 * i - 1} ")
    bw.close()
}