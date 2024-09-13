package src.com.java.world.practice.multithreading.volatile_vs_atomic;

public class VolatileCounterProblem {
    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounterProblem vc = new VolatileCounterProblem();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(vc.getCounter());
    }
}
