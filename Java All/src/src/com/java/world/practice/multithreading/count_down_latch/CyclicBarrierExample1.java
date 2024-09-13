package src.com.java.world.practice.multithreading.count_down_latch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample1 {
    public static void main(String[] args) {
        int numberOfSubsystem = 4;
        CyclicBarrier barrier = new CyclicBarrier(numberOfSubsystem,
                () -> System.out.println("All subsystem are up and running. System startup complete."));

        Thread webServerThread = new Thread(new Subsystem("Web Server",2000,barrier));
        Thread databaseThread = new Thread(new Subsystem("Database",4000,barrier));
        Thread cacheThread = new Thread(new Subsystem("Cache",3000,barrier));
        Thread messagingServiceThread = new Thread(new Subsystem("Messaging Service",3000,barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();
    }
}
class  Subsystem implements Runnable{

    private final String name;
    private final int initializeTime;
    private final CyclicBarrier barrier;

    public Subsystem(String name, int initializeTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializeTime = initializeTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(name+" initialization started.");
            Thread.sleep(initializeTime);
            System.out.println(name+" initialization completed.");
            barrier.await();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: "+e);
        }catch (BrokenBarrierException e){
            System.out.println("BrokenBarrierException: "+e);
        }
    }
}
