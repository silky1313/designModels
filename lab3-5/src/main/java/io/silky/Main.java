package io.silky;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket(100.0);

        for (int i = 0; i < 10; i++) {
            Observer observer = new StockBuyer();
            stockMarket.attach(observer);
        }

        stockMarket.setStockNowPrice(94.9);
    }
}