package com.basic.LogicAndMixed;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static int fact(int n) {
        if (n == 0)
            return 1;   // Base case

        return n * fact(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int result = fact(n);
        System.out.println("Factorial is: " + result);
    }
}