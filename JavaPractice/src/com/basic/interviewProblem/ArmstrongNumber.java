package com.basic.interviewProblem;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check number is armstrong or not");
	int n=sc.nextInt();
	int org=n;
	int original=org;
	int count=0;
	int sum=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	while(org>0) {
		int digit=org%10;
		int pwr=1;
		
		for(int i=1;i<=count;i++) {
			pwr=pwr*digit;
		}
		sum=sum+pwr;
		org=org/10;
	}
	if (sum == original)
        System.out.println(original + " is Armstrong number");
    else
        System.out.println(original + " is not Armstrong number");
}
}
