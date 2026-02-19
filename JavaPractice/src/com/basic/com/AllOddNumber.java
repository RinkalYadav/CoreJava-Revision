package com.basic.com;
import java.util.Scanner;
public class AllOddNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to print number till that number");
	int n = sc.nextInt();
	System.out.println("All the odd number is ");
	for(int i=1;i<=n;i=i+2) {
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("All the Even number is ");
	for(int i=0;i<=n;i=i+2) {
		System.out.print(i+" ");
	}
}
}
