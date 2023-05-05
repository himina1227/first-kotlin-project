package com.example.kotlinproject.lecture

/**
 * 코틀린에서 배열과 컬렉션을 다루는 방법
 * 1. 배열
 * 2. 코틀린에서의 Collection - List, Set, Map
 *  - 컬렉션이 불변인지 가변인지 설정해 줘야 한다.
 *  - 우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자
 * 3. 컬렉션의 null 사용 가능성
 */
class Lec15 {

    fun main() {
        val array = arrayOf(100, 200)

        for (i in array.indices) {
            println("${i} ${array[i]}")
        }

        for ((idx, value) in array.withIndex()) {
            println("$idx $value")
        }

        val map = mutableMapOf<Int, String>()
        map[1] = "MONDAY"
        map[2] = "TUESDAY"

        mapOf(1 to "MONDAY", 2 to "TUESDAY")

        for (key in map.keys) {
            println(key)
            println(map[key])
        }

        for ((key, value) in map.entries) {
            println(key)
            println(value)
        }
     }
}