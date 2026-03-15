package com.basic.patternProblem;

import java.util.Scanner;

public class Pattern6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row  number ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int k=i-1;k>0;k--) {
			System.out.print(k);
		}
		System.out.println();
	}
}
}
