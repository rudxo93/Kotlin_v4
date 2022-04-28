package com.example.kotlinstudy

typealias Number = Int

fun main(args: Array<String>): Unit {
    val a: Number = 10
    println(a) // 결과 : 10
}

/*
    typealias를 Int라는 형식에 적용해서 우리만의 이름인 Number로 지정해서 사용하겠다고 정의

    6 line
     - Number이라는 형식별명을 사용해서 a의 형식을 정한 뒤에 10이라는 수를 할당하고 있다.
    Number가 Int와 완전히 같은것이므로 Int형식으로 내부적으로 저장이되게 된다.

    ** 코틀린의 typealias를 사용하면 아주 긴 타입이나 특정명으로 타입을 따로 정해서 사용하고 싶은 경우에
    유용하게 사용할 수 있다.
*/