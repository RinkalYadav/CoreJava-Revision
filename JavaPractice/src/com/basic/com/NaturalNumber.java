package com.basic.com;
import java.util.Scanner;

public class NaturalNumber {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to till print natural number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.print(i+" ");
	}
	
}
}
