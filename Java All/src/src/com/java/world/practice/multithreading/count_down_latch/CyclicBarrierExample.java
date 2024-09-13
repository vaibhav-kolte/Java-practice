package src.com.java.world.practice.multithreading.count_down_latch;

import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) throws InterruptedException {

        int numberOfServices = 3;
        ExecutorService service = Executors.newFixedThreadPool(numberOfServices);
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices);
        service.submit(new DependantServiceBarrier(barrier));
        service.submit(new DependantServiceBarrier(barrier));
        service.submit(new DependantServiceBarrier(barrier));
        System.out.println("Main Thread");
        service.shutdown();

    }
}

class DependantServiceBarrier implements Callable<String> {
    private final CyclicBarrier barrier;

    public DependantServiceBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        barrier.await();
        return "OK";
    }
}
