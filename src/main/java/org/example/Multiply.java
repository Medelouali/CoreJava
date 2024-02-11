package org.example;

import java.util.Scanner;

public class Multiply {
    public void multiply(){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        scanner.close();

        if (a * b >= c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
