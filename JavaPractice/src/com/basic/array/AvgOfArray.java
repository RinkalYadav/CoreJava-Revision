package com.basic.array;

import java.util.Scanner;

public class AvgOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	System.out.println("Enter the element in array");
	int a[]=new int[n];
	int sum=0;
	float avg;
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enterd array is");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum of array is "+sum);
	
	avg=sum/a.length;
	System.out.println("The average of array is "+avg);
	
}
}
