package com.practice.coding.string;

import java.util.Scanner;

public class CheckVowelOfString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string to check vowel or present or not");
	String str=sc.nextLine();
	int count=0;
	for(int i=0;i<str.length();i++) {
		 char ch = Character.toLowerCase(str.charAt(i));

         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             count++;
             break;
         }
	}
	if(count>=1) {
		System.out.println("String has vowel");
		
	}
	else {
		System.out.println("String has not vowel");
	}
	
}
}
