package com.basic.numbersProblem;

import java.util.Scanner;

public class CheckPerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check number is perfect or not");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		System.out.println("Number is perfect number");
		
	}
	else {
		System.out.println("Number is not perfect number");
	}
}
}
