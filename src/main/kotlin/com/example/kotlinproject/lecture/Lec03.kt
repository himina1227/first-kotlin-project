package com.example.kotlinproject.lecture

import com.example.kotlinproject.domain.Person

/**
 * 코틀린에서 Type을 다루는 방법
 * 1. 기본타입
 * - 코틀린에서는 선언된 기본값을 보고 타입을 추론한다.
 * 2. 타입 캐스팅
 * - 자바에서는 기본 타입간의 변환은 암시적으로 이루어질 수 있지만 코틀린은 명시적으로 이뤄져야한다.
 * 3. Kotlin의 3가지 특이한 타입
 * - Any, Unit, Nothing
 * 4. String Interpolation, String indexing
 */
class Lec03 {
    fun main() {
        val number1: Int? = 3;
//        val number2:Long = number1; //자바에서는 암시적으로 형변환이 이뤄졌지만 코틀린에서는 명시적으로 선언해야하기에 형변환이 안된다.\
        val number2: Long = number1?.toLong() ?: 0L;    // 명시적으로 형변환을 해야한다, 변수가 nullable이면 적절한 처리가 필요하다.

    }

    fun pringAgeIfPerson(obj: Any) {
        if (obj is Person) {
            val person = obj as Person
            println(person) // 스마트 캐스트
        }

        if (obj !is Person) {
            val person = obj as Person
            println(person) // 스마트 캐스트
        }
    }

    fun pringAgeIfNullablePerson(obj: Any?) {
        if (obj is Person) {
            val person = obj as? Person
//            println(person?.age) // 스마트 캐스트
        }
    }
}

//fun main() {
//    var name = """
//
//    """.trimIndent()
//
//    println(name)
//}