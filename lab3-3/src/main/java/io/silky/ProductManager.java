package io.silky;

import java.util.NoSuchElementException;

interface MyIterator<T> {
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
}

public class ProductManager {
    private String[] products;

    public ProductManager(String[] products) {
        this.products = products;
    }

    public MyIterator<String> iterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements MyIterator<String> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < products.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return products[currentIndex++];
        }

        @Override
        public boolean hasPrevious() {
            return currentIndex > 0;
        }

        @Override
        public String previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            return products[--currentIndex];
        }
    }
}