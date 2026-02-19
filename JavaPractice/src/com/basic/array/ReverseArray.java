package com.basic.array;

import java.util.Scanner;

public class ReverseArray {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter element in array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered array is ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("The reverse of array is");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
 }
}
