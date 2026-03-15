package com.basic.LogicAndMixed;

import java.util.Scanner;

public class FindMissingNumberArray {
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
      
      // Expected sum from 1 to n+1
      int expectedSum = (n + 1) * (n + 2) / 2;

      int actualSum = 0;
      for (int i = 0; i < n; i++) {
          actualSum += arr[i];
      }

      int missingNumber = expectedSum - actualSum;

      System.out.println("\nMissing number is: " + missingNumber);
}
}
