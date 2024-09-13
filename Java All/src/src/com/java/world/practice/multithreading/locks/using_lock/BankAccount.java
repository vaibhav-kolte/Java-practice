package src.com.java.world.practice.multithreading.locks.using_lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(threadName + " proceeding with withdrawal.");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException for sleep: " + e);
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(threadName + " completed withdrawal. Remaining balance " + balance);
                } else {
                    System.out.println(threadName + " insufficient balance.");
                    lock.unlock();
                }
            } else {
                System.out.println(threadName + " could not acquire the lock, will try later.");
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException for trylock method: " + e);
            Thread.currentThread().interrupt();
        }
    }
}
