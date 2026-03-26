package com.practice.coding.string;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		StringBuilder rev = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			rev.append (str.charAt(i));
		}
		String reverse=rev.toString();
		
		if(str.equals(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
