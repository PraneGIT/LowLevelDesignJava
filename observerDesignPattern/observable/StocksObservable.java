package observerDesignPattern.observable;

import observerDesignPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStocksCount(int newStockCount);
    public int getStocksCount();
}
