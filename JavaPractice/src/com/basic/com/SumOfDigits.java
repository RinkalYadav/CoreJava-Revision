package com.basic.com;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to print its sum");
	int n=sc.nextInt();
	int sum=0;
	int r;
	n = Math.abs(n); // it is for covert negative value into positive value
	
	while(n>0) {
		r=n%10;
		sum=sum+r;
		n=n/10;
		
	}
	System.out.println("Sum of entered number is "+sum);
}
}
