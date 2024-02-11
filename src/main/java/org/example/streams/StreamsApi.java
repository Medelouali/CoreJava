package org.example.streams;

import org.example.common.Products;
import org.example.innerClasses.Product;

import java.util.ArrayList;
import java.util.List;

public class StreamsApi {
    public static  void run(){
        List<Product> productList= Products.products;
        System.out.println(productList);
        // Take map with any/allMatch
        boolean doAllMatch=productList.stream().map(Product::price).toList().stream().allMatch(p->p>20);
        System.out.println(doAllMatch);

        // Calculate the sum of all products prices
        double totalPrice=productList.stream().peek(System.out::println).toList()
                .stream().mapToDouble(Product::price).sum();
        System.out.println(totalPrice);

        // Distinct
        productList.stream().distinct().toList().forEach(System.out::println);

        // The reduce function
        String text=productList.stream().map(Product::name).reduce("", (n1, n2)->n1+(n1.isEmpty() ? "": " ")+n2);
        System.out.println(text);

        // Calculating the total price using the reduce function
        Double totalPriceUsingReduce=productList.stream().mapToDouble(Product::price).reduce(0.0, Double::sum);
        System.out.printf("""
                Old total price using sum: %.2f
                New total price using reduce: %.2f
                They should be the same of course
                %n""", totalPrice, totalPriceUsingReduce);
    }
}
