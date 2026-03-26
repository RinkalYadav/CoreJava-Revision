package com.practice.coding.factorial;

import java.util.Scanner;

public class FibonnaciSeries {
	public static int fib(int n) {
		if (n<=1) return n;
		
		return fib(n-1)+fib(n-2);
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to till the print fibonacci series");
	int n=sc.nextInt();
	 System.out.print("A Fibonacci sequence of " + n + " numbers: ");

     for (int i = 0; i <n; i++) {
           System.out.print(fib(i) + " ");
     }
	
	
}
}
