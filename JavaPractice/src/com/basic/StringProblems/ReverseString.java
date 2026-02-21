package com.basic.StringProblems;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string to print its reverse");
	String str=sc.next();
	String str2="";
	for(int i=str.length()-1;i>=0;i--) {
		str2=str2+str.charAt(i);
	}
	System.out.println("Reverse of string is "+str2);
	
}
}
