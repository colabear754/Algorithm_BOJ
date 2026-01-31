package _31900

fun main()=print(readln().split(" ").map{it.toInt()}.let{maxOf(it[0]+it[2],it[1])})