package observerDesignPattern.observable;

import java.util.ArrayList;

import observerDesignPattern.observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable {

    private int stocksCount=0;
    public ArrayList<NotificationAlertObserver> observeArrayList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        observeArrayList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observeArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer:observeArrayList){
            observer.update();
        }
    }

    @Override
    public void setStocksCount(int newStockCount) {
        if(newStockCount != this.stocksCount){
            this.stocksCount = newStockCount;
            if(this.stocksCount != 0) {
                notifyObservers();
            }
        }
    }

    @Override
    public int getStocksCount() {
        return stocksCount;
    }
    
}
