package com.example.kotlinstudy

fun main(args: Array<String>): Unit {
    val a = 10
    val b = 20

    println("a의 값은 $a")
    println("b의 값은 $b")

    println("a + b = ${a + b}")

    println("\\\$를 쓰면 어떻게 될까?")
    println("나의 월 수익은 10,000\$다")
}

/*
   12번째 줄에 \ 자체를 출력하고 싶다면 \를 두번 \\ 이렇게 사용하면 된다.
   또한 $를 출력하고 싶다면 \$를 사용하면 된다.

   ** 코틀린에서 문자열 내에 변수를 표기하고 싶으면 $변수명 / 표현식을 표시하고 싶다면 ${표현식}을 사용한다.
*/