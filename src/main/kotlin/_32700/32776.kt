package _32700

fun main()=print(readln().toInt().let{if(it<=240||it<=readln().split(" ").sumOf{it.toInt()})"high speed rail" else "flight"})