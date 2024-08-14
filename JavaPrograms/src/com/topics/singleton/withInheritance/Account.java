package com.topics.singleton.withInheritance;

public class Account {
    private static Account instance = null;
    private final String accountNumber;
    private double balance;

    private Account() {
        accountNumber = "1234567890";
        balance = 0;
    }

    public static synchronized Account getInstance() {
        if (instance == null)
            instance = new Account();

        return instance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void creditBalance(double balance) {
        this.balance += balance;
    }

    public void debitBalance(double balance) {
        if (this.balance >= balance)
            this.balance -= balance;
        else
            System.out.println("You have low balance.");
    }
}
