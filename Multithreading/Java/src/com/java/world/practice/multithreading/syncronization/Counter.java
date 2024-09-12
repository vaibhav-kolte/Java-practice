package com.java.world.practice.multithreading.syncronization;

public class Counter {
    private long count = 0;


    // Synchronized method
//    public synchronized void increment(String message) {
//        System.out.println(message + " " + count);
//        count++;
//    }


    // Synchronized block of code
    public void increment(String message) {
        System.out.println(message + " " + count);
        synchronized (this) {
            count++;
        }
    }

    public long getCount() {
        return count;
    }
}
