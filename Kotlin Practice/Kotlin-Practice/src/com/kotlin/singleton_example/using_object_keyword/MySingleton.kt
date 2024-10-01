package com.kotlin.singleton_example.using_object_keyword

object MySingleton {

    var value: Int = 0

    fun add(num: Int) {
        value += num
    }

    fun subtract(num: Int) {
        value -= num
    }

    fun show() {
        println("Value is ${value}")
    }
}