package com.basic.com;
import java.util.Scanner;
public class PrintAscii {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character to print it's ascii value");
	char ch = sc.next().charAt(0);
	int a =ch;
	System.out.println("The ascii value of "+ch+" is "+a);
}
}
