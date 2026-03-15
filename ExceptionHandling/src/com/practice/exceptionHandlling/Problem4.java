package com.practice.exceptionHandlling;

import java.util.Scanner;

// Custom Exception
class InvalidAgeException1 extends Exception {
	 private static final long serialVersionUID = 1L; // only for the remove the eclispe warning not else
    public InvalidAgeException1(String message) {
        super(message);
    }
}

public class Problem4 {

    // Method using throws
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            validateAge(age);  // calling method
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}