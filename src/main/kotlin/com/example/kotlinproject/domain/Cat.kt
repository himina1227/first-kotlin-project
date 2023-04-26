package com.example.kotlinproject.domain

class Cat(
    species: String
) : Animal(species, 4) {    // code convention 상속 받을때는 한칸:한칸

    override fun move() {
        TODO("Not yet implemented")
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}