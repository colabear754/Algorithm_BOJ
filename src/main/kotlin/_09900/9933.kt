package _09900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val passwords = mutableSetOf<String>()
    repeat(n) {
        val password = readLine()
        if (!passwords.add(password) || !passwords.add(password.reversed())) return@with println(password.run { "$length ${this[length / 2]}" })
    }
}