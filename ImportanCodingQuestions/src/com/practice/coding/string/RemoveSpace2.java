package com.practice.coding.string;

import java.util.Scanner;

public class RemoveSpace2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	System.out.println("Entered string is "+str);
	
	String str2=str.trim();
	System.out.println(str2);
}
}
