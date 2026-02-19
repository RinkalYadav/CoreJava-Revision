package com.basic.com;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int factorial=1;
	System.out.println("Enter a number to find factorial");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		factorial=factorial*i;
	}
	System.out.println("Factorial is "+factorial);
}

}
