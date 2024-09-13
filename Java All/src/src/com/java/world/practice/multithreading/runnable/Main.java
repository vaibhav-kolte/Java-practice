package src.com.java.world.practice.multithreading.runnable;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world.");
//        System.out.println(Thread.currentThread().getName());

        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
        while (true) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
