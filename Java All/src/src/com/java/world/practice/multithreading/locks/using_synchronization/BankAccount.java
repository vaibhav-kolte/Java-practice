package src.com.java.world.practice.multithreading.locks.using_synchronization;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(threadName + " proceeding with withdrawal.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e);
            }
            balance -= amount;
            System.out.println(threadName + " completed withdrawal. Remaining balance " + balance);
        } else {
            System.out.println(threadName + " insufficient balance.");
        }
    }
}
