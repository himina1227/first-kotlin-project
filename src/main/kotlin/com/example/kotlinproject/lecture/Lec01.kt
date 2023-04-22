package com.example.kotlinproject.lecture

// 접근 제한자 생략하면 Public
class Lec01 {

    /**
     * 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.
     * 숫자, 문자, 불리언과 같은 몇몇 타입은 내부적으로 특별한 표현을 갖는다
     * Java 에서는 long 과 Long타입을 연산할시 boxing unboxing이 일어나며 불필요한 연산이 일어나는데 반해
     * 코틀린은 내부적으로 연산시 primitive 으로 변환해준다.
     * 즉 코틀린은 boxing과 unboxing을 고려하지 않아도 알아서 처리해 준다.
     */
    fun main() {
        var number1: Long = 10L // long number = 10L; -> variable 약자 compiler 가 자동으로 타입 추론해주기에 타입 생략 가능하지만 넣고싶다면
        val number2 = 10L // final long number = 10L; -> value 의 약자
        // number2: Long? = null -> Kotlin에서 null이 변수에 들어 갈 수 있다면 타입? 을 사용해야 한다.
//        var person = Person("김낙겸"); // Kotlin에서 객체 인스터스화를 할 때에는 new를 붙이지 않아야 한다.
    }
}