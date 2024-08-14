package com.topics.singleton.withInheritance;

public class AccountManager {
    Account account;

    public AccountManager() {
        account = Account.getInstance();
    }

    public String getAccountNumber() {
        return account.getAccountNumber();
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void creditBalance(double balance) {
        account.creditBalance(balance);
    }

    public void debitBalance(double balance) {
        account.debitBalance(balance);
    }
}
