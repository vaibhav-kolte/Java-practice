package com.java.world.practice.multithreading.thread_methods;

public class ThreadInterruptExample extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        }
    }

    public static void main(String[] args) {
        // Interrupt example
        ThreadInterruptExample t2 = new ThreadInterruptExample();
        t2.start();
        t2.interrupt();
    }
}
