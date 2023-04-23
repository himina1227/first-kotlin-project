package com.example.kotlinproject.lecture

import java.lang.IllegalArgumentException

/**
 * 코틀린에서 조건문을 다루는 방법
 * 1. if문
 * 2. Expression과 statement
 * 3. switch와 when
 */
class Lec05 {
    fun validateScoreIsNotNegative(score: Int) {
        if (score < 0) {
            throw IllegalArgumentException("${score}는 0보다 작을 수 없다.")
        }

        if (score !in 0..100) {

        }
    }
}