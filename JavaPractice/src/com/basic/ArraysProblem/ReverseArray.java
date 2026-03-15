package com.basic.ArraysProblem;

import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element inside array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered array is");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	
	int start=0;
	int end=n-1;
	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	System.out.println();
	System.out.println("Reverse of array is ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
