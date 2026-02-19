package com.basic.array;

import java.util.Scanner;

public class CopyArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int n=sc.nextInt();
	System.out.println("Enter array element");
	int a[]=new int[n];
	int b[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Entered array is ");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Copying one array to another");
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	System.out.println("1st array is ");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("2nd array is ");
	for(int i=0;i<a.length;i++) {
		System.out.print(b[i]+" ");
	}
	sc.close();
}
}
