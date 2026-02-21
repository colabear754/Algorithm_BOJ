package _32900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val ingredients = mutableSetOf<String>()
    StringTokenizer(readLine()).run { repeat(n) { ingredients.add(nextToken()) } }
    StringTokenizer(readLine()).run { repeat(n - 1) { ingredients.remove(nextToken()) } }
    println(ingredients.first())
}