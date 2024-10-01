package com.kotlin.singleton_example.using_companion_object

class MyClass {
    companion object {
        private var value: Int = 0

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
}