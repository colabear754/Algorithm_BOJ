package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (r, c, zr, zc) = readLine().split(" ").map { it.toInt() }
    val newspaper = Array(r) { readLine().toCharArray() }
    for (i in 0..<r) {
        repeat(zr) {
            for (j in 0..<c) bw.write("${newspaper[i][j]}".repeat(zc))
            bw.newLine()
        }
    }
    bw.close()
}