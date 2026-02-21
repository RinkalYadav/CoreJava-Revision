package com.basic.numbersProblem;

import java.util.Scanner;

public class CheckPalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check number is palindrome or not");
	int n=sc.nextInt();
	int p=n;
	int r=0;
	int temp;
	while(n>0) {
		temp=n%10;
		r=(r*10)+temp;
		n=n/10;
	}
	if(r==p) {
		System.out.println("Number is palindrome");
	}
	else {
		System.out.println("Number is not palindrome");
	}
}
}
