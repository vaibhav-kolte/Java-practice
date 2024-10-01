package com.kotlin.static_method

interface MyInterface {
    companion object {
        fun staticMethod() {
            println("This is a static method inside an interface's companion object.")
        }
    }
}