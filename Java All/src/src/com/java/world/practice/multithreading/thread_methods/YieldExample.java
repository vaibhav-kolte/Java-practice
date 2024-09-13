package src.com.java.world.practice.multithreading.thread_methods;

public class YieldExample extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running.");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldExample e1 = new YieldExample();
        YieldExample e2 = new YieldExample();
        e1.start();
        e2.start();
    }
}
