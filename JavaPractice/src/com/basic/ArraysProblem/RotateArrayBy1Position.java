package com.basic.ArraysProblem;

import java.util.Scanner;

public class RotateArrayBy1Position {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Right rotate by 1
        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("\nArray after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}