package com.basic.numbersProblem;

import java.util.Scanner;

public class PrintAllPrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number till print all the prime number");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(" "+i);
		}
	}
}
}
