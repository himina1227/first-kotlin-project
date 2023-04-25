package com.example.kotlinproject.lecture

/**
 * 코틀린에서 반복문을 다루는 방법
 * 1. for-each 문
 * 2. 전통적인 for문
 * 3. Progression과 Range -> 등차수열 / 공차 -> range 란 구간이 1인 progression을 의미한다. progression이란 시작점과 끝점이 있고, 구간을 지정할 수 있는 범위이다.
 * 4. while문
 */
class Lec06 {

    fun main() {
        val numbers = listOf(1L, 2L, 3L)
        for (number in numbers) {
            println(number)
        }

//        for (i in 1..3) {
//        for (i in 1 downTo 3) { // 3, 2, 1
//        for (i in 1 downTo 3) { // 3, 2, 1
        for (i in 1..5 step 2) { // 3, 2, 1
            println(i)
        }
    }
}