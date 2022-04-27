package com.example.kotlinstudy

fun main(args: Array<String>): Unit {
    val a: Byte = 125
    val b: Short = (100 + 200) * 100 // 30000
    var c: Int = 12_4354_6538 // 가시성 향상 표기법( _ )

    c = 0xFF_88_88 // 0x는 16진수
    c = 0b01010010_01100011_01110101_01000101 // 0b는 2진수 8진법은 지원x(코틀린은 8진수를 지원하지 않는다.)

    var d: Long = -543_7847_3984_7238_4723 // 자동 Long

    c = a + b // byte + short = Int / byte + byte = Int / short + short = Int
    d = c + 10L // L = Long

    var e: Float = 67.6f // f = Float(부동 소수점 방식)
    val f: Double = 658.456

    e = (e + f).toFloat() // e는 Float타입 이므로
    println(e)
}