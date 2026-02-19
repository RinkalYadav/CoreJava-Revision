package com.basic.com;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is a armstrong number or not ");
		int n=sc.nextInt();
		int c=n;
		int m=c;
		int r;
		int arm=1;
		int count=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			count++;
		}
		while(m>0) {
			r=m%10;
			arm=1;
			for(int i=1;i<=count;i++) {
				arm=arm*r;
			}
			sum=sum+arm;
			m=m/10;
		}
		if(c==sum) {
			System.out.println("Number is armstrong ");
			
		}
		else {
			System.out.println("Number is not armstrong");
		}
	}

}
