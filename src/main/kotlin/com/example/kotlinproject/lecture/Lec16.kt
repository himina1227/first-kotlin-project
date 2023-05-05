package com.example.kotlinproject.lecture

/**
 * 코틀린에서 다양한 함수를 다루는 방법
 * 1. 확장함수
 *  - 확장함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.
 *  - 멤버함수와 확장함수의 시그니쳐가 같다면 -> 멤버함수가 호출된다
 *  - 해당 변수의 현재 타입 즉, 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.
 * 2. infix 함수(중위 함수) step, in
 * 3. inline 함수
 *  - 함수를 복사 붙여넣기 하는 함수
 *  - 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
 * 4. 지역함수
 */
class Lec16 {
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}