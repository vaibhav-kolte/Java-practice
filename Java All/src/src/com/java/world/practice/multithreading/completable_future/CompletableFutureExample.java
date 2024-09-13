package src.com.java.world.practice.multithreading.completable_future;

import java.util.concurrent.*;

// Introduce in Java 8
public class CompletableFutureExample {
    public static void main(String[] args) {
//        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            } catch (InterruptedException e) {
//                System.out.println("InterruptedException: " + e);
//            }
//            return "OK";
//        });
//        try {
//            String s = completableFuture.get();
//            System.out.println(s);
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException: " + e);
//        } catch (ExecutionException e) {
//            System.out.println("ExecutionException: " + e);
//        }
//        System.out.println("main");


        // -----------------------------------------------------------------------------------------


//        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            } catch (InterruptedException e) {
//                System.out.println("InterruptedException: " + e);
//            }
//            return "OK";
//        });
//
//        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            } catch (InterruptedException e) {
//                System.out.println("InterruptedException: " + e);
//            }
//            return "OK";
//        });
//
//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(f1, f2);
//        voidCompletableFuture.join();
//        System.out.println("main");


        // -----------------------------------------------------------------------------------------


//        try {
//            String f1 = CompletableFuture.supplyAsync(() -> {
//                try {
//                    Thread.sleep(5000);
//                    System.out.println("Worker");
//                } catch (InterruptedException e) {
//                    System.out.println("InterruptedException: " + e);
//                }
//                return "OK";
//            }).get();
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException: " + e);
//        } catch (ExecutionException e) {
//            System.out.println("ExecutionException: " + e);
//        }
//
//        System.out.println("main");


        // -----------------------------------------------------------------------------------------


//        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            } catch (InterruptedException e) {
//                System.out.println("InterruptedException: " + e);
//            }
//            return "OK";
//        }).thenApply(x -> x + x);
//        try {
//            System.out.println(f1.get());
//        } catch (InterruptedException e) {
//            System.out.println("InterruptedException: " + e);
//        } catch (ExecutionException e) {
//            System.out.println("ExecutionException: " + e);
//        }
//
//        System.out.println("main");


        // -----------------------------------------------------------------------------------------


        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e);
            }
            return "OK";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s -> "Timeout occurred.");
        try {
            System.out.println(f1.get());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        } catch (ExecutionException e) {
            System.out.println("ExecutionException: " + e);
        }

        System.out.println("main");


    }
}
