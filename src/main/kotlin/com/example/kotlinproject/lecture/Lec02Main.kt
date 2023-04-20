package com.example.kotlinproject.lecture

import java.lang.IllegalArgumentException
import java.nio.channels.IllegalChannelGroupException

/**
 * Kotlin에서 null을 다루는 방법
 * 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다.
 * null 이 아닌 경우에만 호출되는 Safe Call(?.) 이 있다.
 * null 인 경우에만 호출되는 Elvis(?:)가 있다
 * null 이 절때 아닐때 널 아님단언(!!)이 있다
 * Kotlin에서 Java 코드를 사용할 때 플랫폼 타입 사용에 유의 해야한다.
 * Java 코드를 읽으며 널 가능성을 확인하며 Kotlin으로 Wrapping을 확인해야한다.
 */
class Lec02Main {

    // kotlin에서 null을 배우는 방법 safe call, Elvis연산자
    fun startsWithA1(str: String?) {
        if (str == null) {
            throw IllegalArgumentException()
        }

        val str: String? = null;
        println(str?.length ?: 0)
        println(str!!.length ?: 0)  //절대 NULL 이 아닐거라 확신하면 !!
    }
}