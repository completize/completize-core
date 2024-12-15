package com.completize.core.utility

fun String.isBlank(): Boolean {
    var result = true
    for (element in this)
        result = result && Character.isWhitespace(element)
    return result
}

fun String.parse(parse: Parse) {
    parse.apply(this)
}

enum class Parse(private val function: (String) -> String) {

    LOWER_CASE(String::lowercase),
    UPPER_CASE(String::uppercase);

    fun apply(value: String): String {
        return function.invoke(value)
    }

}