package _10000

fun main()=print(List(5){readln().toInt()}.sumOf{if(it<40)40 else it}/5)