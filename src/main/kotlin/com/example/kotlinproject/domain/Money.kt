package com.example.kotlinproject.domain

import javax.print.attribute.standard.MediaSize.Other

data class Money(
    val amount: Long
) {

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}