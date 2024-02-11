package org.example.innerClasses;

import java.util.*;

public class InnerClasses {
    public static void run(){
        // Anonymous classes
        List<Product> productList= new ArrayList<>();
        Comparator<Product> sortedProductsComparator=(p1, p2)-> p1.name().compareTo(p2.name());
        productList.add(new Product("T", 200.3));
        productList.add(new Product("A", 20.9));
        productList.add(new Product("M", 10.3));
        productList.add(new Product("L", 2.3));
        System.out.println(productList);
        productList.removeIf(p->p.price()<100);
//        productList.sort(sortedProductsComparator.thenComparing((s1, s2)->s2.price().compareTo(s1.price())).reversed());
//        productList.stream().filter(p->p.price()>100).toList().
//                stream().map(p->Math.pow(p.price(), 2)).toList().forEach(System.out::println);

        System.out.println(productList);


    }
}
