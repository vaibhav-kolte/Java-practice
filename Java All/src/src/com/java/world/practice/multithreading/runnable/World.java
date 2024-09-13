package src.com.java.world.practice.multithreading.runnable;

public class World implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
