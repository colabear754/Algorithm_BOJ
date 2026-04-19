package _24000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toLong()
        bw.write(if (n % 3 == 2L || n % 9 == 0L) "TAK\n" else "NIE\n")
    }
    bw.close()
}