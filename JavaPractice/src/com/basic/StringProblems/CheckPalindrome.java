package com.basic.StringProblems;

import java.util.Scanner;

public class CheckPalindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string to check palindrome or not");
	String str=sc.next();
	String str2="";
	for(int i=str.length()-1;i>=0;i--) {
		str2=str2+str.charAt(i);
	}
	if(str.equals(str2)) {
		System.out.println("String is palindrome ");
	}
	else {
		System.out.println("String is not palindrome");
	}
}
}
