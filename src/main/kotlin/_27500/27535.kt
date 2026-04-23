package _27500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val types = "HTCKG"
    val chocolates = StringTokenizer(readLine()).run { Array(5) { Chocolate(nextToken().toInt(), types[it]) } }
    val m = readLine().toInt()
    val eatArray = Array(m) { StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } } }
    var sum = chocolates.sumOf { it.count }
    repeat(m) { i ->
        val numeral = sum % 10
        repeat(5) { j -> chocolates[j].count -= eatArray[i][j].also { sum -= it } }
        bw.appendLine(if (numeral > 1) "${sum.toString(numeral)}7H" else "${sum}7H")
        bw.appendLine(if (sum == 0) "NULL" else chocolates.sorted().joinToString(""))
    }
    bw.close()
}

private class Chocolate(var count: Int, val type: Char): Comparable<Chocolate> {
    override fun compareTo(other: Chocolate) = if (this.count == other.count) this.type - other.type else other.count - this.count
    override fun toString() = if (count > 0) "$type" else ""
}