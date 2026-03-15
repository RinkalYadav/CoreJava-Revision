package com.practice.exceptionHandlling;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18+");
            }
            System.out.println("Eligible to vote");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Not eligible to vote");
        }

        sc.close();
    }
}