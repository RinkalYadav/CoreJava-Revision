package com.practice.coding.string;

import java.util.Scanner;

public class RemoveSpace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	System.out.println("Entered string is "+str);
	String str2="";
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			str2=str2+str.charAt(i);
		}
		
	}
	System.out.println("After removed space strign is "+str2);
}
}
