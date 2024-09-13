package src.com.java.world.practice.multithreading.executor_framework;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(20);
        return 1;
    }
}
