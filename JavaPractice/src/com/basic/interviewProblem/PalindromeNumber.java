package com.basic.interviewProblem;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check palindrome");
	int n=sc.nextInt();
	int org=n;
	int rvr=0;
	
	while(n>0) {
		int r=n%10;
		rvr=r+rvr*10;
		n=n/10;
	}
	if(rvr==org) {
		System.out.println("Number is palindrome");
		
	}
	else {
		System.out.println("Number is not palindrome");
	}
}
}
