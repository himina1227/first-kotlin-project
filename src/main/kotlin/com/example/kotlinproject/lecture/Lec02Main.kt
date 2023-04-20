package com.example.kotlinproject.lecture

import java.lang.IllegalArgumentException
import java.nio.channels.IllegalChannelGroupException

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