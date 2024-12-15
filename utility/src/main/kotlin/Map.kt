package com.completize.core.utility

fun MutableMap<String, Any>.parseKeyToLowerCase(keep: Boolean = true): Map<String, Any> {
    return parseKeyTo(Parse.LOWER_CASE, keep)
}

fun MutableMap<String, Any>.parseKeyToUpperCase(keep: Boolean = true): Map<String, Any> {
    return parseKeyTo(Parse.UPPER_CASE, keep)
}

fun MutableMap<String, Any>.parseKeyTo(parse: Parse, keep: Boolean = true): Map<String, Any> {
    return parseKeyTo(if (keep) this else HashMap(), parse)
}

fun MutableMap<String, Any>.parseKeyTo(to: MutableMap<String, Any>, parse: Parse): Map<String, Any> {
    val backup = HashSet<Map.Entry<String, Any>>(this.entries)
    to.clear()
    for (entry in backup)
        to[parse.apply(entry.key)] = entry.value
    return to;
}