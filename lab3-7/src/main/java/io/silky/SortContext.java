package io.silky;


public class SortContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortData(int[] data) {
        strategy.sort(data);
    }
}
