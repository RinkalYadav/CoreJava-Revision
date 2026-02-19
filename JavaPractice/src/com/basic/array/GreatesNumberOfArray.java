package com.basic.array;

import java.util.Scanner;

public class GreatesNumberOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n=sc.nextInt();
	System.out.println("Enter the element in array");
	int a[]=new int[n];
	int max=0;
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Enterd array is");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println("");
	max=a[0];
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	  	}
	System.out.println("Maximum number is "+max);
}
}
