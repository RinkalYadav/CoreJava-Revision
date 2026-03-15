package com.basic.ArraysProblem;

import java.util.Scanner;

public class FindSmallest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered array is");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	int min=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println("Smallest element of array is "+min);
}
}
