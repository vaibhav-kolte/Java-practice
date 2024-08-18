package patterns.com.observer_pattern.observable;

import patterns.com.observer_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable {

    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver notificationAlertObserver : observerList) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0 && newStockAdded > 0) {
            System.out.printf("\n\nCurrently stock is zero and added %d stocks please hurry up!\n", newStockAdded);
            notifySubscribers();
        }

        stockCount = newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
