package com.topics.singleton.withoutInheritance;

public class User {
    public static void main(String[] args) {
        GPay gPay = new GPay();
        PhonePay phonePay = new PhonePay();
        Paytm paytm = new Paytm();

        System.out.println("Available Balance is " + gPay.getBalance());
        paytm.creditBalance(500);
        System.out.println("Account number: "+phonePay.getAccountNumber());
        System.out.println("Available Balance is " + phonePay.getBalance());
        System.out.println("Account number: "+gPay.getAccountNumber());
        phonePay.debitBalance(300);
        System.out.println("Available Balance is " + gPay.getBalance());
        System.out.println("Account number: "+paytm.getAccountNumber());
    }
}
