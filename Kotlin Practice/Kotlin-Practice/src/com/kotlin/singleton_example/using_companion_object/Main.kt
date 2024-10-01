package com.kotlin.singleton_example.using_companion_object


fun main() {
    val mySingleton1 = MyClass
    mySingleton1.show()
    mySingleton1.add(10)
    mySingleton1.show()
    println("Instance1 $mySingleton1")

    val mySingleton2 = MyClass
    mySingleton2.show()
    mySingleton2.subtract(5)
    mySingleton1.show()
    mySingleton2.show()
    println("Instance2 $mySingleton2")
}