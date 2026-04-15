package _11500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val princess = List(n) { readLine() }
    when (readLine().toInt()) {
        1 -> bw.write(princess.joinToString("\n"))
        2 -> princess.forEach {
            for (i in n - 1 downTo 0) bw.write("${it[i]}")
            bw.newLine()
        }
        else -> for (i in n - 1 downTo 0) bw.appendLine(princess[i])
    }
    bw.close()
}