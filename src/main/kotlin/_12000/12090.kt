package _12000

fun main()=print(readln().map{"ㄱㄲㄴㄷㄸㄹㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎ"[(it-'가')/588]}.joinToString(""))