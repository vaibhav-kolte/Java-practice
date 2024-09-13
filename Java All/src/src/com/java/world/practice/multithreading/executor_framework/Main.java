package src.com.java.world.practice.multithreading.executor_framework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static long factorial(int value) {
        if (value <= 1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e);
            }
            return 1;
        } else return value * factorial(value - 1);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            threadList.add(i, new Thread(() -> {
                System.out.println("Factorial of " + finalI + " is " + factorial(finalI));
            }));
            threadList.get(i).start();
        }
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime));
    }
}
