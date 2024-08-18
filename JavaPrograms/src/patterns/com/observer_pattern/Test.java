package patterns.com.observer_pattern;

import patterns.com.observer_pattern.observable.IPhoneObservableImpl;
import patterns.com.observer_pattern.observable.StockObservable;
import patterns.com.observer_pattern.observer.EmailAlertObserverImpl;
import patterns.com.observer_pattern.observer.MobileAlertObserverImpl;
import patterns.com.observer_pattern.observer.NotificationAlertObserver;

public class Test {
    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 =
                new EmailAlertObserverImpl("vaibhav1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 =
                new EmailAlertObserverImpl("vaibhav2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 =
                new MobileAlertObserverImpl("1234567890", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);
    }
}
