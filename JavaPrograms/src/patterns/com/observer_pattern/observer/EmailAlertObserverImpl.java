package patterns.com.observer_pattern.observer;

import patterns.com.observer_pattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(email, "Product is in stock hurry up!");
    }

    private void sendMail(String email, String message) {
        System.out.println("Mail sent to: " + email);
        System.out.println(message);
    }
}
