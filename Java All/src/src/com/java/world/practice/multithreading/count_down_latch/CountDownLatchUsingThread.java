package src.com.java.world.practice.multithreading.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchUsingThread {
    public static void main(String[] args) throws InterruptedException {

        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        for (int i = 0; i < numberOfServices; i++) {
            new Thread(new DependantServiceUsingThread(latch)).start();
        }
        latch.await();
        System.out.println("Main Thread");

    }
}

class DependantServiceUsingThread implements Runnable {
    private final CountDownLatch latch;

    public DependantServiceUsingThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e);
        } finally {
            latch.countDown();
        }
    }
}

