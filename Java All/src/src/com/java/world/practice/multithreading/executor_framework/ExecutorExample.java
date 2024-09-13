package src.com.java.world.practice.multithreading.executor_framework;

import java.util.concurrent.*;

public class ExecutorExample {
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
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> System.out.println("Factorial of " + finalI + " is " + factorial(finalI)));
        }
        executor.shutdown();
        try {
//            executor.awaitTermination(20, TimeUnit.SECONDS);
            while (!executor.awaitTermination(100, TimeUnit.MILLISECONDS)) {
                System.out.println("Waiting...");
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime));




    }
}
