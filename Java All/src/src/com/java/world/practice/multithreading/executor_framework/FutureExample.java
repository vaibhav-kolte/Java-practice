package src.com.java.world.practice.multithreading.executor_framework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        Future<Integer> submit = executorService.submit(() -> 1 + 2);
//        Integer i = submit.get();
//        System.out.println("Sum is " + i);
//        executorService.shutdown();
//        System.out.println(executorService.isTerminated());


        // -----------------------------------------------------------------

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        Callable<Integer> callable1 = () -> {
//            Thread.sleep(1000);
//            System.out.println("Task 1");
//            return 1;
//        };
//        Callable<Integer> callable2 = () -> {
//            Thread.sleep(1000);
//            System.out.println("Task 2");
//            return 2;
//        };
//        Callable<Integer> callable3 = () -> {
//            Thread.sleep(1000);
//            System.out.println("Task 3");
//            return 3;
//        };
//
//        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
//        List<Future<Integer>> futures = null;
//        try {
//            futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException: " + e);
//        }
//
//        assert futures != null;
//        for (Future<Integer> future : futures) {
//            try {
//                System.out.println(future.get());
//            } catch (CancellationException e) {
//                System.out.println("CancellationException: " + e);
//            } catch (InterruptedException e) {
//                System.out.println("InterruptedException: " + e);
//            } catch (ExecutionException e) {
//                System.out.println("ExecutionException: " + e);
//            }
//        }
//        executorService.shutdown();
//        System.out.println("Finished");


        // ---------------------------------------------------------------------------------


//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Callable<Integer> callable1 = () -> {
//            Thread.sleep(1000);
//            System.out.println("Task 1");
//            return 1;
//        };
//        Callable<Integer> callable2 = () -> {
//            Thread.sleep(1000);
//            System.out.println("Task 2");
//            return 2;
//        };
//        Callable<Integer> callable3 = () -> {
//            Thread.sleep(1000);
//            System.out.println("Task 3");
//            return 3;
//        };
//
//        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
//        try {
//            Integer i = executorService.invokeAny(list);
//            System.out.println(i);
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException: " + e);
//        } catch (ExecutionException e) {
//            System.out.println("ExecutionException: " + e);
//        }
//
//        executorService.shutdown();
//        System.out.println("Finished");


        // ---------------------------------------------------------------------------------


        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e);
            }
            return 96;
        });

        future.cancel(true);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        executorService.shutdown();

    }
}
