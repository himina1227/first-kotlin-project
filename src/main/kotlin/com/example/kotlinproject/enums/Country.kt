package com.example.kotlinproject.enums

/**
 * when은 Enum Class 혹은 Sealed Class 와 함께 사용할 경우, 더욱더 진가를 발휘한다.
 */
enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US"),
    ;
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }

}