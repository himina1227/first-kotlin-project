package com.example.kotlinproject.lecture

/**
 * 코틀린에서 함수를 다루는 방법
 * 1. 함수 선언 문법
 * 2. default parameter
 * 3. named argument(parameter)
 * 4. 같은 타입의 여러 파라미터 받기(가변인자)
 */
class Lec08 {
//    fun max(a: Int, b: Int): Int {
//        if (a > b) {
//            return a
//        }
//        return b
//    }

//    fun max(a: Int, b: Int): Int {
//        return if (a > b) {
//            a
//        } else {
//            b
//        }
//    }

    // 함수가 하나의 결과값이면 block 대신 = 사용 가능
    fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

    // Default Parameter
    fun repeat(
        str: String,
        num: Int = 3,
        useNewLine: Boolean = true
    ) {
        for (i in 1..num) {
            if (useNewLine) {
                println(str)
            } else {
                print(str)
            }
        }
    }

    fun main() {
        printAll("A", "B", "C")
        val array = arrayOf("A", "B", "C")
        printAll(*array)
    }

    fun printAll(vararg strings: String) {
        for (str in strings) {
            println(str)
        }
    }
}