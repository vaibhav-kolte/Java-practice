package src.com.java.world.practice.multithreading.thread_methods;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is running...");
        for (int i = 1; i <= 10; i++) {
            String a = "";
            for (int j = 0; j < 100000; j++) {
                a = "a";
            }
            System.out.println(Thread.currentThread().getName() +
                    " - Priority: " + Thread.currentThread().getPriority() +
                    " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyThread low = new MyThread("Low");
        MyThread medium = new MyThread("Medium");
        MyThread high = new MyThread("High");
        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.start();
        medium.start();
        high.start();
//        low.join();
//        System.out.println("Finish");



    }
}
