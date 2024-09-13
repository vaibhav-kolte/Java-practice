package src.com.java.world.practice.multithreading.count_down_latch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchSolution {
    public static void main(String[] args) throws InterruptedException {

        int numberOfServices = 3;
        ExecutorService service = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        service.submit(new DependantServiceSolution(latch));
        service.submit(new DependantServiceSolution(latch));
        service.submit(new DependantServiceSolution(latch));
        latch.await();
        System.out.println("Main Thread");
        service.shutdown();

    }
}

class DependantServiceSolution implements Callable<String> {
    private final CountDownLatch latch;

    public DependantServiceSolution(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(2000);
        } finally {
            latch.countDown();
        }
        return "OK";
    }
}
