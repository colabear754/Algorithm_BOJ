package _18100

fun main()=print(readln().toLong().let{n->(n-1).takeHighestOneBit()+n/2+n%2-1})