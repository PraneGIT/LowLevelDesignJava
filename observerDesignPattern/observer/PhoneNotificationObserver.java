package observerDesignPattern.observer;

import observerDesignPattern.observable.StocksObservable;

public class PhoneNotificationObserver implements NotificationAlertObserver{

    String number;
    StocksObservable stocksObservable;

    public PhoneNotificationObserver(String number,StocksObservable observable){
        this.stocksObservable = observable;
        this.number = number;
    }

    @Override
    public void update() {
        System.out.println(number+",your item is back in stocks");
    }
}
