package com.basic.StringProblems;

import java.util.Scanner;

public class ReplaceCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string ");
	String str=sc.next();
	System.out.println("Enter a character to replace");
	char oldch=sc.next().charAt(0);
	System.out.println("Enter new character");
	char newch=sc.next().charAt(0);
	
	String result="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch==oldch) {
			result=result+newch;
		}
		else {
			result=result+ch;
		}
	}
	System.out.println("After replacement "+result);
}
}
