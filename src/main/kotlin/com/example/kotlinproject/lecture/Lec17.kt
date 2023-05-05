package com.example.kotlinproject.lecture

/**
 * 코틀린에서 람다를 다루는 방법
 * 1. Java에서 람다를 다루기 위한 노력
 * 2. 코틀린에서의 람다
 *  - 코틀린에서는 함수가 그 자체로 값이 토리 수 있다. 변수에 할당할수도, 파라미터로 넘길 수도 있다.
 * 3. Closure
 *  - 코틀린에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.
 *  이렇게 해야만, 람다를 진정한 ㅇ리급 시민으로 간주할 수 있다. 이 데이터 구조를 Closure라고 부른다.
 * 4. 다시 try with resources
 */
class Lec17 {

    private fun filterFruits(
        fruits: List<Fruit>, filter: (Fruit) -> Boolean
    ): List<Fruit> {
        val results = mutableListOf<Fruit>()
        for (fruit in fruits) {
            if (filter(fruit)) {
                results.add(fruit)
            }
        }

        return results
    }
}

data class Fruit(val name: String, val price: Int)