package com.kotlin.singleton_example.thread_safe_singleton_using_lazy

class MyThreadSafeSingleton {
    private var count = 0

    companion object {
        val instance: MyThreadSafeSingleton by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            MyThreadSafeSingleton()
        }
    }

    fun showMessage() {
        println("This is a thread-safe singleton.")
        println("Count = ${++count}")
        println()
    }
}