package src.com.java.world.practice.multithreading.count_down_latch;

import java.util.concurrent.*;

public class CountDownLatchProblem {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<String> future1 = service.submit(new DependantService());
        Future<String> future2 = service.submit(new DependantService());
        Future<String> future3 = service.submit(new DependantService());

        try {
            future1.get();
            future2.get();
            future3.get();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        } catch (ExecutionException e) {
            System.out.println("ExecutionException: " + e);
        }
        System.out.println("All dependent service finished. Starting new main service...");
        service.shutdown();

    }
}

class DependantService implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(2000);
        return "OK";
    }
}