package com.topics.singleton.withInheritance;

public class GPay extends AccountManager {
    @Override
    public void creditBalance(double balance) {
        super.creditBalance(balance + 5); // add 5 rs extra if you credit using GPay
    }
}
