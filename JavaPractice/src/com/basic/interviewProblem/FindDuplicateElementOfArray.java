package com.basic.interviewProblem;

import java.util.Scanner;

public class FindDuplicateElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int dup[] = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    // check already added or not
                    boolean alreadyAdded = false;
                    for (int k = 0; k < index; k++) {
                        if (dup[k] == arr[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }

                    if (!alreadyAdded) {
                        dup[index] = arr[i];
                        index++;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Duplicate array elements are:");

        for (int i = 0; i < index; i++) {
            System.out.print(dup[i] + " ");
        }
    }
}