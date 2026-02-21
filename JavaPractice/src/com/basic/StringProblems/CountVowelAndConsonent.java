package com.basic.StringProblems;

import java.util.Scanner;

public class CountVowelAndConsonent {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string to check how many vowel and consonet");
	String str=sc.next();
	int vowel=0;
	int consonent=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ) {
			vowel++;
		}
		else {
			consonent++;
		}
	}
	System.out.println(str+" has "+vowel+" vowel and "+consonent+" consonet");
}
}
