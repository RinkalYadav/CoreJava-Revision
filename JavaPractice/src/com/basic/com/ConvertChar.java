package com.basic.com;

import java.util.Scanner;

public class ConvertChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter charcter ");
	char ch=sc.next().charAt(0);
	if(ch>='A' && ch<='Z') {
		char ch2= Character.toLowerCase(ch);
		System.out.println(ch2);
	}
	else {
		char ch2=Character.toUpperCase(ch);
		System.out.println(ch2);
	}
}
}
