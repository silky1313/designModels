package io.silky;

public class StockBuyer implements Observer {

    @Override
    public void update(Subject subject) {
        StockMarket stockMarket = (StockMarket) subject;
        System.out.format("Your initial price is %.2f, the current price is %.2f. The drop is %.2f%%.%n",
                stockMarket.getStockInitPrice(),
                stockMarket.getStockNowPrice(),
                (1 - (stockMarket.getStockNowPrice() / stockMarket.getStockInitPrice())) * 100);
    }
}
