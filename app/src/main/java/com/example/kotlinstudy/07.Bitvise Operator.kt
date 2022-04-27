package com.example.kotlinstudy

fun main(args: Array<String>): Unit {
    println(15 and 7)       // 결과 : 7
    println(5 or 2)         // 결과 : 7
    println(15 xor 2)       // 결과 : 13
    println(32767.inv())    // 결과 : -32768
    println(1 shl 3)        // 결과 : 8
    println(8 shr 1)        // 결과 : 4
    println(-17 ushr 2)     // 결과 : 1073741819
}

/*
    and
    15의 경우 비트로 2진수로 나타내면 1111, 7의 경우 2진수로 나타내면 0111이다.
    그렇기 때문에 and 연산을 할 경우 둘 다 1인 비트만 남게되어 0111 즉, 7이 된다.

    or
    5의 경우 0101, 2의 경우 0010 이 두 비트를 or 연산할 경우 0111 즉, 7이 된다.

    xor
    1111, 0101을 xor 연산할 경우 1010 즉 10이 된다.

    inv() -> 비트를 반전시키는 연산
    32767은 2진수로 나타내면 0111 1111 1111 1111이다
    이때 해당 숫자에 NOT 연산을 해주게되면 -32768이 된다.
    사실 1000 0000 0000 0000은 10진수로 32768이다.
    즉 0111 1111 1111 1111을 반전시키면 32768이 되지 않고 부호 비트의 경우에도 적용이 되어 음수(마이너스)가 되었다.

    shl
    10진수 1을 왼쪽으로 3번 시프트 할 경우 2진수 1000이 되어 10진수 8이 된것이다.
    shl은 shift left가 된것이다.

    shr
    이것을 유추했을때 shr은 shift right라는 것을 알 수 있고 8 shr 1은 0100, 즉 10 진수 4가 되는것이다.

    ushr
    -17의 경우 2진수로 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1110 1111 이다.
    그리고 1073741819의 경우 2진수로 0011 1111 1111 1111 1111 1111 1111 1011이다.
    ushr(unsigned shift right)은 shift를 하되 밀리는 비트의 경우 0으로 채워주는 것
*/