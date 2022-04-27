package com.example.kotlinstudy

fun main(args: Array<String>): Unit {
    val num: Int = 19 - 4 * 4
    val num2: Int = 65 % 7
    val num3: Double = 7.5 / 3 + 22.75
    val num4: Double = num / num2 + 0.7

    println(num) // 결과 : 3
    println(num2) // 결과 : 2
    println(num3) // 결과 : 25.25
    println(num4) // 결과 : 1.7

    val num5: Double = num.toDouble() / num2 + 0.7
    println(num5) // 결과 : 2.2
}

/*
*   a - b : a에서 b를 뺸다.
*   a + b : a에서 b를 더한다.
*   a * b : a에서 b를 곱한다.
*   a / b : a를 b로 나눈다.
*   a % b : a를 b로 나눈 나머지를 구한다.
*
*   ** 연산자의 우선순위
*      : 곱셈과 나눗셈이 덧셈과 뺼셈보다 우선되어 계산된다.
*        % 연산자로는 나머지를 구할 수 있는데 이 연산자 또한 우선순위가 있으며 +, - 보다 높은 우선순위를 갖는다.
*
*   num4는 int형인 num과 num2를 나누기 연산을 했다.
*   이럴 경우 두 개의 타입이 int형 이므로 나눗셈 연산을 해도 결과는 int형인 정수로 소숫점 부분은 손실된다.
*   그렇기 때문에 보통 형 변환을 통해 한쪽의 형식을 변환 후 계산(의도한 것이 아니라면)
*
*   num5를 보게되면 .toDouble() 이라는 함수를 통해서 Int형을 double형식으로 변환해준 뒤 연산 실행
*
*   ** 코틀린은 자바보다 더 엄격한 타입 검사를 진행하기 때문에 double형에 int형을 넣는다는 것은 아예 불가능하다.
**/