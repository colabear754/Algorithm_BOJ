package _10900

fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    for (i in 1..n) {
        append(" ".repeat(n - i)).append("* ".repeat(i - 1)).append("*\n")
    }
    println(this)
}