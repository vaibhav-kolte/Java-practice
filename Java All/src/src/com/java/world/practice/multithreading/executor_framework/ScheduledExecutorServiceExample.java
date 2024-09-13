package src.com.java.world.practice.multithreading.executor_framework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.schedule(
//                ()-> System.out.println("Task executed after 5 second delay!"),
//                5,
//                TimeUnit.SECONDS
//        );
//        scheduler.shutdown();



        // ----------------------------------------------------------------------------



//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.scheduleAtFixedRate(
//                () -> System.out.println("Task executed after every 5 second!"),
//                5,
//                5,
//                TimeUnit.SECONDS
//        );
//
//        scheduler.schedule(() -> {
//            System.out.println("Initiating shutdown....");
//            scheduler.shutdown();
//        }, 21, TimeUnit.SECONDS);



        // ----------------------------------------------------------------------------



        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Task executed after every 5 second!"),
                5,
                5,
                TimeUnit.SECONDS
        );

        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown....");
            scheduler.shutdown();
        }, 21, TimeUnit.SECONDS);
    }

}
