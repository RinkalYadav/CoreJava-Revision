package com.basic.com;

import java.util.Scanner;

public class FacterOfNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to find its factor");
	int n=sc.nextInt();
    for(int i=1;i<=n;i++) {
    	if(n%i==0) {
    		System.out.println("Factor is "+i);
    	}
    }
}
}
