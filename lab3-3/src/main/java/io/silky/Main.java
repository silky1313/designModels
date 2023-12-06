package io.silky;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Product 1", "Product 2", "Product 3", "Product 4"};

        ProductManager productManager = new ProductManager(products);
        MyIterator<String> myIterator =  productManager.iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        System.out.println("Reverse Order:");

        while (myIterator.hasPrevious()) {
            System.out.println(myIterator.previous());
        }
    }
}