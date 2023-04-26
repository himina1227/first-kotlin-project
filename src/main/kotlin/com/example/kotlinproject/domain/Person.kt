package com.example.kotlinproject.domain

import java.lang.IllegalArgumentException

// 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다.
//class Person constructor(name: String, age: Int){
//class Person (name: String, age: Int){ // constructor 생략가능
//
//    val name: String = name;
//    var age: Int = age;
//
//}

//class Person (
//    val name: String,
//    var age: Int
//){
//}

class Person (
//    val name: String,
    name: String = "최재현",
    var age: Int
) {
//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

    // Setter 자체를 지양하기 때문에 custom setter도 잘 안쓴다.
    var name = name
        set(value) {
            field = value.uppercase()
        }

//    val uppercaseName: String
//        get() = this.name.uppercase()

    // 주생성자에서 받은 name을 불편 프로퍼티 name에 바로 대입
    // 무한루프를 막기 위한 예약어, 자기 자신을 가리킨다. backing field라 부른다.
    // custom getter에서 backing field를 사용하는 경우 드물다
//    val name = name
//        get() = field.uppercase()

    // 클래스가 초기화되는 시점에 한 번 호출되는 블록
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 부생성자(secondary constructor)
    // 최종적으로 주생성자를 this로 호출해야 하며 body를 가질 수 있다.
    // 코틀린에서는 기본적으로 부생성자보다는 default parameter를 권장한다
    // Converting과 같은 경우 부생성자를 사용할 수 있지만 그보다는 정적 팩토리 메소드를 추천
    constructor(name: String) : this(name, 1) {
        println("부생성자 1")
    }

    constructor() : this("최태현") {
        println("부생성자 2")
    }

    // 함수
//    fun isAudult(): Boolean {
//        return this.age >= 20
//    }

    // custom getter, 프로퍼티처럼 사용
//    val isAdult: Boolean
//        get() = this.age >= 20
//    val isAdult: Boolean
//        get() = this.age >= 20
    // custom getter
    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
}

// getter, setter 대신 .필드를 통해 가져 올 수 있다
fun main() {
    val person = Person("최태현", 100)
    println(person.name)
    person.age = 10
    println(person.age)
}