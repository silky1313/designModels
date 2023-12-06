package io.silky;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StockMarket implements Subject{
    List<Observer> observers;
    Double stockInitPrice;
    Double stockNowPrice;

    public StockMarket(Double stockInitPrice) {
        this.stockInitPrice = stockInitPrice;
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers = observers.stream()
                .filter(o -> o != observer)
                .collect(Collectors.toList());
    }

    @Override
    public void notifyObservers() {
        observers.forEach(s -> s.update(this));
    }

    public Double getStockInitPrice() {
        return stockInitPrice;
    }

    public Double getStockNowPrice() {
        return stockNowPrice;
    }

    public void setStockNowPrice(Double stockNowPrice) {
        this.stockNowPrice = stockNowPrice;
        double rate = (this.getStockNowPrice() / this.getStockInitPrice()) * 100;
        if(rate < 95.0) {
            notifyObservers();
        }
    }
}
