package _16200

fun main()=print(readln().split(" ").map{it.toInt()}.let{(n,m,k)->minOf(m,k)+minOf(n-m,n-k)})