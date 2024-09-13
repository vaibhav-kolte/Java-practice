package src.com.java.world.practice.multithreading.executor_framework;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

//Runnable        Callable
//No return       return
//run method      call method
//No throw        throws