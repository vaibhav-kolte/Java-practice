package com.kotlin.singleton_example.lazy_initilization_object

object MyLazySingleton {
    init {
        println("Singleton Initialized!")
    }

    private var count = 0

    fun showMessage() {
        count++
        println("This is a lazy singleton.")
        println("Count = $count")
        println()
    }
}