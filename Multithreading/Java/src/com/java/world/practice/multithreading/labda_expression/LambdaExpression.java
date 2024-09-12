package com.java.world.practice.multithreading.labda_expression;

public class LambdaExpression {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };

        // Same as above
        Runnable runnable = () -> System.out.println("Hello");

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
