package src.com.java.world.practice.multithreading.thread_methods;

public class DaemonExample extends Thread {
    @Override
    public void run() {
        long count = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running, Count: " + count++);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Example 1
//        DaemonExample d1 = new DaemonExample();
//        d1.setDaemon(true);
//        d1.start();
////        Thread.sleep(1000);
//        System.out.println("Main done");


        // Example 2
        DaemonExample d1 = new DaemonExample();
        DaemonExample d2 = new DaemonExample();
        d1.setDaemon(true);
        d1.start();
        d2.start();
        System.out.println("Main done");
    }
}
