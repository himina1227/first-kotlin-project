package com.example.kotlinproject.lecture

import java.lang.NumberFormatException

/**
 *  코틀린에서 예외를 다루는 방법
 *  1. try catch finally 구문
 *  2. Checked Exception과 Unchecked Exception
 *   - kotlin에선 Checked Exception과 Unchecked Exception상관없이 모두 Unchecked Exception이다.
 *  3. try with resources
 */
class Lec07 {
    fun parseIntOrThrow(str: String): Int {
        try {
            return str.toInt()
        } catch (e: NumberFormatException) {
            throw NumberFormatException("주어진 ${str}는 숫자가 아닙니다.")
        }
    }

    fun parseIntOrThrowV2(str: String): Int? {
        return try {
            str.toInt()
        } catch (e: NumberFormatException) {
            null
        }
    }
}