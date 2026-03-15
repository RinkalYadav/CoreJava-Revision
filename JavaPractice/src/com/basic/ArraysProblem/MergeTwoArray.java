package com.basic.ArraysProblem;

import java.util.Scanner;

public class MergeTwoArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of 1st array");
	int n1=sc.nextInt();
	int arr1[]=new int[n1];
	System.out.println("Enter the size of 2nd array");
	int n2=sc.nextInt();
	int arr2[]=new int[n2];
	System.out.println("Enter the element in 1st array");
	for(int i=0;i<n1;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter the element in 2nd array");
	for(int i=0;i<n2;i++) {
		arr2[i]=sc.nextInt();
	}
	System.out.println("1st array is ");
	for(int i=0;i<n1;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println("2nd array is ");
	for(int i=0;i<n2;i++) {
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	
	int merge[]=new int[n1+n2];
	
	for(int i=0;i<n1;i++) {
		merge[i]=arr1[i];
		
	}
	for(int i=0;i<n2;i++) {
		merge[n1+i]=arr2[i];
		
	}
	System.out.println("Merged array is ");
	for(int i=0;i<n1+n2;i++) {
		System.out.print(merge[i]+" ");
	}
	System.out.println();
}
}
