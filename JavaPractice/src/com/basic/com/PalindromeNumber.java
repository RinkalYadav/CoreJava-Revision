package com.basic.com;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check it is palindrome or not");
	int n=sc.nextInt();
	int r=0;
	int re=0;
	int o=n;
	while(n>0) {
		r=n%10;
		re=(re*10)+r;
		n=n/10;
	}
	if(re==o) {
		System.out.println("Number is palindrome ");
	}
	else {
		System.out.println("Number is not palindrome");
	}
}
}
