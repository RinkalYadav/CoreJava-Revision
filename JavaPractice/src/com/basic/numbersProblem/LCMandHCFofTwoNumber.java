package com.basic.numbersProblem;

import java.util.Scanner;

public class LCMandHCFofTwoNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number to find its lcm and hcf");
	int a=sc.nextInt();
	System.out.println("Enter 2nd number to find its lcm and hcf");
	int b=sc.nextInt();
	int hcf=1;
	int lcm=1;
	
	for(int i=1;i<=Math.min(a, b);i++) {
		if(a%i==0 && b%i==0) {
			hcf=i;
		}
	}
	System.out.println("HCF = "+hcf);
	
	lcm=(a*b)/hcf;
	System.out.println("LCM = "+lcm);
}
}
