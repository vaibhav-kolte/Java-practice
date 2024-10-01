package com.kotlin.singleton_example.thread_safe_singleton_using_lazy

fun main() {
    MyThreadSafeSingleton.instance.showMessage()
    MyThreadSafeSingleton.instance.showMessage()
    MyThreadSafeSingleton.instance.showMessage()
    MyThreadSafeSingleton.instance.showMessage()
}