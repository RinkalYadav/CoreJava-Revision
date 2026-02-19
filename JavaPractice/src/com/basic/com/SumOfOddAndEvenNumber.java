package com.basic.com;
import java.util.Scanner;
public class SumOfOddAndEvenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int oddsum=0;
	int evensum=0;
	for(int i=0;i<=n;i=i+2) {
		oddsum=oddsum+i;
	}
	System.out.println("sum of all the even number "+oddsum);
	
	for(int i=1;i<=n;i=i+2) {
		evensum=evensum+i;
	}
	System.out.println("Sum of all the odd number is "+evensum);
}
}
