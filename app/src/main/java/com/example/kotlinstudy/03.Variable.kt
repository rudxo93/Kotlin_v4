package com.example.kotlinstudy

fun main(args: Array<String>):Unit {

    var total: Int // var를 사용해서 변수 선언, : Int -> 타입
    total = 0 // 변수 초기화

    val a: Int = 93 + 6 + 4 - 10 // val는 상수 -> 한번 초기화 하면 나중에 절대로 변하지 않는 값
    println(a) // 결과 : 93

    val b: Int = 53 + 95 + a
    println(b) // 결과 : 241

    total = a + b
    println(total) // 결과 : 334
}

/*
*   코틀린에서 변수는 var, 변하지 않는 상수는 val로 선언할 수 있다
*   var 변수명: 타입  -> 패턴으로 선언한다.
*   현재 6번째 줄 total에 밑줄이 쳐져 있는 이유는 total를 초기화 하는데 이것을
*   한 줄로 간단히 할 수 있기 때문에 지적해주고 있다.
* */