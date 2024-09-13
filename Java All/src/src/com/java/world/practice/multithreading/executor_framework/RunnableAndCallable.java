package src.com.java.world.practice.multithreading.executor_framework;

import java.util.concurrent.*;

public class RunnableAndCallable {
    public static void main(String[] args) {
        // Executor return type example
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> 96);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        } catch (ExecutionException e) {
            System.out.println("ExecutionException: " + e);
        }
        executorService.shutdown();

        //----------------------------------------------------------------------------

        ExecutorService executor = Executors.newSingleThreadExecutor();
//        Runnable runnable = () -> 96; // Runnable did not get any return value
//        Callable<Integer> callable = () -> 96;
        Future<?> future1 = executor.submit(() -> 96);
        try {
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        } catch (ExecutionException e) {
            System.out.println("ExecutionException: " + e);
        }
        executor.shutdown();
    }
}
