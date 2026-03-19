package com.practice.coding.number;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check is it prime or not");
	int n=sc.nextInt();
	int count=0;
	if(n<=1) {
		System.out.println("Entered number is not prime number");
		return;
	}
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			System.out.println("Entered number is not prime number");
			return;
		}
	}
	
		System.out.println("Entered number is prime number");
	
}
}
