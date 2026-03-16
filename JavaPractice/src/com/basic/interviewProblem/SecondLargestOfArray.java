package com.basic.interviewProblem;

import java.util.Scanner;

public class SecondLargestOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element in array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered array is ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	
//	for(int i=0;i<n;i++) {
//		for(int j=i+1;j<n;j++) {
//			if(arr[i]>arr[j]) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	System.out.println();
//	System.out.println("Sorted array is ");
//	for(int i=0;i<n;i++) {
//		System.out.print(arr[i]+" ");
//	}
//	System.out.println();
//	for(int i=n-2;i>=0;i--) {
//		if(arr[i]!=arr[n-1]) {
//			System.out.println("Second largest nummber is "+arr[i]);
//			break;
//		}
//	}
	if(n < 2){
	    System.out.println("Second largest not possible");
	    return;
	}
	int larg=arr[0];
	int sndlarg=arr[1];
	if(larg<sndlarg) {
		int temp=larg;
		larg=sndlarg;
		sndlarg=temp;
	}
	for(int i=2;i<n;i++) {
		if(arr[i]>larg){
			sndlarg=larg;
			larg=arr[i];
		}
		else if(arr[i]<larg && arr[i]>sndlarg && arr[i]!=larg) {
			sndlarg=arr[i];
		}
	}
	System.out.println();
	System.out.println("Second largest is the "+sndlarg);
	
}
}
