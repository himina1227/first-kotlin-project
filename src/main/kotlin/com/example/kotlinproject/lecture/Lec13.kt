package com.example.kotlinproject.lecture

/**
 * 코틀린에서 중첩 클래스를 다루는방법
 * 1. 중첩 클래스의 종류
 * 2. 코틀린의 중첩 클래스와 내부 클래스
 */
class Lec13 {
}

class House(
    private var address: String,
    private var livingRoom: LivingRoom
) {
//    class LivingRoom(   // 중첩 static class
    inner class LivingRoom(   // 권장되지 않는 inner class
        private var area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}

