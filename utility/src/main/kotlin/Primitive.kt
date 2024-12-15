@file:Suppress("UNCHECKED_CAST")
package com.completize.core.utility

private val TYPES: Map<Class<*>?, Class<*>> = mapOf(
    Boolean::class.javaPrimitiveType to Boolean::class.java,
    Byte::class.javaPrimitiveType to Byte::class.java,
    Char::class.javaPrimitiveType to Char::class.java,
    Double::class.javaPrimitiveType to Double::class.java,
    Float::class.javaPrimitiveType to Float::class.java,
    Int::class.javaPrimitiveType to Int::class.java,
    Long::class.javaPrimitiveType to Long::class.java,
    Short::class.javaPrimitiveType to Short::class.java,
)

fun <T : Class<*>?> Class<*>?.translate(): T {
    return (TYPES[this] ?: this) as T;
}