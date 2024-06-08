package observerDesignPattern.observer;

import observerDesignPattern.observable.StocksObservable;

public class MailNotificationObserver implements NotificationAlertObserver {

    StocksObservable stocksObservable;
    String email;

    public MailNotificationObserver(String email,StocksObservable observable){
        this.stocksObservable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println(email+",your item is back in stocks");
    }
    
}
