package com.java.world.practice.multithreading.thread;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world.");
//        System.out.println(Thread.currentThread().getName());

        World world = new World();
        world.start();
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
