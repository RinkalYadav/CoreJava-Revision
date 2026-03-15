package com.basic.ArraysProblem;

import java.util.Scanner;

public class SecondLargestNumber {
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
	if(n<2) {
		System.out.println("Second largest not possible");
	}
	else {
	int first;
	int second;
	if(arr[0]>arr[1]) {
		first=arr[0];
		second=arr[1];
	}
	else {
		first=arr[1];
		second=arr[0];
	}
	for(int i=2;i<n;i++) {
		if(arr[i]>first) {
			second=first;
			first=arr[i];
		}
		else if(arr[i]>second && arr[i]<first) {
			second=arr[i];
		}
		
	}
	System.out.println("The 2nd largest element is " + second);
	}
}
}
