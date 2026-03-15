package com.basic.ArraysProblem;

import java.util.Scanner;

public class RemoveDuplicate {
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
	boolean isduplicate;
	for(int i=0;i<n;i++) {
		isduplicate=false;
		for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) {
				isduplicate=true;
				break;
			}
		}
		if(!isduplicate) {
			System.out.print(arr[i]+" ");
		}
	}
}
}
