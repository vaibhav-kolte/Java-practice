package com.kotlin.singleton_example.lazy_initilization_object

fun main() {
    val myLazySingleton1 = MyLazySingleton
    myLazySingleton1.showMessage()
    myLazySingleton1.showMessage()

    val myLazySingleton2 = MyLazySingleton
    myLazySingleton2.showMessage()
    myLazySingleton2.showMessage()
}