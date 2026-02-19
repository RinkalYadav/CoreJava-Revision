package com.basic.com;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to print its revers order");
	int n=sc.nextInt();
	int s=0;
	int r=0;
	while(n>0) {
		s=n%10;
		r=(r*10)+s;
		n=n/10;
		
	}
	System.out.println("Reverse number is "+r);
}
}
