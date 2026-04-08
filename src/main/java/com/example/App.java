package com.demos;

public class App {
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int num = 5;
        System.out.println("Java CI/CD Application Started...");
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    
    }
}