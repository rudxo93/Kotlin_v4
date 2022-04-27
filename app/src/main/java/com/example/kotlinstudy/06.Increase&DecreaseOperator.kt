package com.example.kotlinstudy

fun main(args: Array<String>): Unit {

    var a = 100
    var b = 50

    println(a++ +b) // 결과 : 150
    println(a)      // 결과 : 101
    println(--b)    // 결과 : 49
}

/*
*   ++a 는 해당 line에서 a에 1을 더하고 a에 할당한다.
*   a++ 는 해당 line에서 a값을 그대로 유지하고 다음 line으로 가기 직전 0.0000001초 직전에 a에 1을 더한 값을 a에 다시 할당
*
*   그렇기 때문에 a++ +b 는 a는 그대로 있는 채로 b를 더했기 때문에 150
*   바로 다음줄에서 a를 보게되면 101이 출력된것이 확인된다.
*   --b 는 선감소 연산이기 때문에 해당 line에서 바로 -1 이 감소하여 49가 출력이된다.
* */