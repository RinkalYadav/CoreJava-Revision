package com.basic.interviewProblem;

import java.util.Scanner;

public class LargestElementArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	System.out.println("Enter the element in array");
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered array is ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println();
	System.out.println("Greates number of array is "+max);
	
}
}
