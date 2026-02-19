package com.basic.numbersProblem;
// prime number means a number which has only two factors 1 and itself
import java.util.Scanner;

public class CheckPrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check number is prime or not");
	int n=sc.nextInt();
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0)
			count++;
	}
	if(count==2) {
		System.out.println("Entered number is prime number");
	}
	else {
		System.out.println("Enterd number is not prime number");
	}
	sc.close();
}
}
