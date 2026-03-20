package com.practice.coding.number;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to till the print fibonacci series");
	int n=sc.nextInt();
	int f=0;
	int s=1;
	for(int i=1;i<=n;i++) {
		System.out.print(f+" ");
	     int next=f+s;
	     f=s;
	     s=next;
	   
	}
}
}
