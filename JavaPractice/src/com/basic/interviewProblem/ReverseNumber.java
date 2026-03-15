package com.basic.interviewProblem;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to reverse");
	int n=sc.nextInt();
	int rvr=0;
	
	while(n>0) {
		int r=n%10;
		rvr=r+rvr*10;
		n=n/10;
	}
	System.out.println("Reverse number is "+rvr);
	}
}
