package com.basic.numbersProblem;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to prints its reverse order");
	int n=sc.nextInt();
	int r=0;
	int rvr=0;
	while(n>0) {
		r=n%10;
		rvr=(rvr*10)+r;
		n=n/10;
	}
	System.out.println("Reverse number is "+rvr);
}
}
