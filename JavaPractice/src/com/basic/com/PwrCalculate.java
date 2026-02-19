package com.basic.com;
import java.util.Scanner;
public class PwrCalculate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res=1;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Enter the power of number");
		int p=sc.nextInt();
		
		for(int i=1; i<=p;i++) {
			res=res*n;
		}
		System.out.println("result is "+res);
	}
}
