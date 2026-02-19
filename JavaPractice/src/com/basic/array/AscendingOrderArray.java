package com.basic.array;

import java.util.Scanner;

public class AscendingOrderArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	int tmp=0;
	System.out.println("Enter the element in array");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enterd array is");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<i;j++) {
			if(a[i]<a[j]) {
				tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
		}
	}
	System.out.println();
	System.out.println("Array in ascending order");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
	
}
}
