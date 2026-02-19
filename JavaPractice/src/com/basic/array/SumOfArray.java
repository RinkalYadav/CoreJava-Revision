package com.basic.array;

import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	System.out.println("Enter the array element in array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	System.out.println("Entered array is");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Sum of array element is ");
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
