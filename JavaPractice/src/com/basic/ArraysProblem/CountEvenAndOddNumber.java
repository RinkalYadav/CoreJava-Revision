package com.basic.ArraysProblem;

import java.util.Scanner;

public class CountEvenAndOddNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element in array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered the array is ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	int evenCount=0;
	int oddCount=0;
	for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			evenCount++;
		}
		else {
			oddCount++;
		}
	}
	
	System.out.println("Entered array has "+evenCount+" even and "+oddCount+" odd number");
}
}
