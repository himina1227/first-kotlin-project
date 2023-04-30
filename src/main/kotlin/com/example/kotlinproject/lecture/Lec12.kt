package com.example.kotlinproject.lecture

/**
 * 코틀린에서 object 키워드를 다루는 방법
 * 1. static 함수와 변수
 *  static : 클래스가 인스턴스화 될때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
 *  companion object : 클래스와 동행하는 유일한 오브젝트
 *      companion object, 즉 동반 객체도 하나의 객체로 간주되며 때문에 이름을 붙일 수도 있고, interface를 구현할 수도 있다.
 *      또한 유틸성 함수들을 넣어도 되지만, 최상단 파일을 활용하는 것을 추천한다.
 * 2. 싱글톤
 *  object Singleton
 * 3. 익명 클래스
 *  object: 타입이름
 */
class Lec12 {
}

class Person private constructor(
    private val name: String,
    private val age: Int
) {

    companion object {
        private const val MIN_AGE = 0   // const 란 컴파일 시에 변수가 할당되며, 진짜 상수를 붙이기 위한 용도 이다. 기본 타입과 String에 붙일 수 있다.

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}