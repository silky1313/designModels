package io.silky;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 9, 1, 2, 4};
        SortContext sortContext = new SortContext();
        SelectionSortStrategy selectionSortStrategy = new SelectionSortStrategy();
        InsertionSortStrategy insertionSortStrategy = new InsertionSortStrategy();
        QuickSortStrategy quickSortStrategy = new QuickSortStrategy();

        sortContext.setStrategy(quickSortStrategy);
        sortContext.sortData(a);
        for (int j : a) {
            System.out.println(j);
        }
    }
}

