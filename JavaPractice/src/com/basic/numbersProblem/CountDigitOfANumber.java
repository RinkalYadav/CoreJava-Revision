package com.basic.numbersProblem;

import java.util.Scanner;

public class CountDigitOfANumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to count its digit");
		int n=sc.nextInt();
		int r;
		int count=0;
		while(n>0) {
			r=n%10;
			count++;
			n=n/10;
		}
		System.out.println("The number of digit is "+count);
	}
}
