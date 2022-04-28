package com.example.kotlinstudy

fun main(){
    /* 변수에 null을 할당하게 되면 코틀린에서는 이러한 방식은 에러이다. */
    val str1: String = "Hello Kotlin"
    //str1 = null // Errpor!
    println("str1: $str1")

    /* 그렇기 때문에 코틀린에서 변수에 null을 사용하고 싶다면 변수 타입 옆에 ? 를 붙여서
        null을 사용하겠다고 명시를 해주어야한다. */
    var str2: String? = "Hello Kotlin"
    str2 = null
    println("str2: $str2")

    /* null이 허용된 변수 사용시 null 체크 방법에 관한 두가지 방식이 있다.
       1. safe call - 세이프 콜은 "?."을 사용하며 이래의 str2가 null이 아닐 경우에만 멤버 length에
                      접근하는 예시이다.(만약 str2가 null일 경우는 그대로 null이 반환) */
    // println("str2 length: ${str2.length}") // 불가능
    println("str2 length: ${str2?.length}") // null이 아니면 length멤버에 접근, null이면 null

    /* 단정기호 "!!."을 사용하며 null이 아님을 단정하고 컴파일을 강제할 수 있다.
       하지만 실행 시 해당 단정기호를 사용하는 변수가 null일 경우에 NPE가 발생! */
    //println("str2 length: ${str2!!.length}") // null 아님을 단정, null 이어도 컴파일은 된다.(but! 실행 중 NPE발생

    // 조건문 활용 null 허용 변수 검사
    /*  원래 null검사를 하지 않는 경우 컴파일이 되지 않았지만, 조건문을 통해 null검사를 해준 경우 정상적으로
        컴파일 되는것을 확인할 수 있다.*/
    val len = if(str2 != null) str2.length else -1 // 조건문을 통해 null 검사를 한 경우 컴파일 가능
    println("str2: $str2, length: ${len}")

    // 세이프 콜, 엘비스(?:) 연산자 함께 활용
    /* 엘비스 연산자는 아래 코드에서 str2?.length가 null일 경우 -1을 사용(반환)하게 되며, null이 아닐 경우에는
        str2?.length 값을 사용(반환)하게 된다.
        즉, 원래 str2?.length만 사용할 경우에는 str2가 null인 경우 null이 그대로 반환되지만, 엘비스 연산자를
        추가하여 null인 경우 추가 처리를 하여 -1이 반환되도록 해줄 수 있다.*/
    println("str2: $str2, length: ${str2?.length ?: -1}") // null이면 -1 반환, unll이 아니면 str2?.length반환

}