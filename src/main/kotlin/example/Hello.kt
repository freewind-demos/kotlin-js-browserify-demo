package example

import kotlin.browser.window

external fun require(lib: String): dynamic

external object str {
    fun left(n: Int): str
    val s: String
}

typealias S = (String) -> str

val s = require("string") as S

fun main(args: Array<String>) {
    window.alert(s("hello").left(2).s)
}



