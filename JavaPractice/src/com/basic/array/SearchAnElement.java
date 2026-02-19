package com.basic.array;

import java.util.Scanner;

public class SearchAnElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the element in array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enterd array element is");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	System.out.println("Enter the number for found inside array");
	int f=sc.nextInt();
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==f) {
			count++;
		}
	}
	if(count>0) {
		System.out.println("Number is found "+count+" times");
	}
	else {
		System.out.println("Number is not found");
	}
}
}
