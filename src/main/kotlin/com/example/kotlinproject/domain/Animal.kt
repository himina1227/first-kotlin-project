package com.example.kotlinproject.domain

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 코틀린에서는 기본적으로 final, 그러나 상속을 허용하려면 open을 붙여야 한다.
) {
    abstract fun move()
}