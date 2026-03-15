package com.basic.ArraysProblem;

import java.util.Scanner;

public class LargestNumberOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	System.out.println("Enter the element of array");
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered array is");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int max=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("The largest element of an array is "+max);
}
}
