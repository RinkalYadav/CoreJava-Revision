package com.basic.numbersProblem;
// armstrong number means how many digits that will be power of each digit and all the sum of these equals to the number

import java.util.Scanner;

public class CheckArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check number is armstrong or not");
	int n=sc.nextInt();
	int c=n;
	int m=c;
	int r;
	int arm=0;
	
	int count=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	while(c>0) {
		r=c%10;
		int a=1;
		for(int i=1;i<=count;i++) {
			a=a*r;
		}
		arm=arm+a;
		c=c/10;
	}
	if(arm==m) {
		System.out.println("Entered number is armstrong number");
	}
	else {
		System.out.println("Entered number is not armstrong number");
	}
}
}
