package org.example.spliterators;

import org.example.common.Products;
import org.example.innerClasses.Product;

import java.util.List;
import java.util.Spliterator;

public class Spliterators {
    private static Integer counter=1;
    public static void run(){
        List<Product> productList= Products.products;
        Spliterator<Product> originalSpliterator=productList.spliterator();
        printProducts(originalSpliterator);
        System.out.println(Products.products.size());
    }

    private static void printProducts(Spliterator<Product> spliterator){
        if(spliterator==null)return;
        if(spliterator.estimateSize()==1) {
            spliterator.tryAdvance(p-> System.out.println("["+counter+"] "+p.name()));
            counter++;
            return;
        }
        printProducts(spliterator.trySplit());
        printProducts(spliterator);
    }
}
