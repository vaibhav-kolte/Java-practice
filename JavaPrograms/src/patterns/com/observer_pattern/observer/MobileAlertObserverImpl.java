package patterns.com.observer_pattern.observer;

import patterns.com.observer_pattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String mobileNumber;
    StockObservable observable;

    public MobileAlertObserverImpl(String mobileNumber, StockObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(mobileNumber, "Product is in stock hurry up!");
    }

    private void sendMessageOnMobile(String mobileNumber, String message) {
        System.out.println("Message sent to: " + mobileNumber);
        System.out.println(message);
    }
}
