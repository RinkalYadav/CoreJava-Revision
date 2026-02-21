package com.basic.StringProblems;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string to remove dupllicate");
	String str=sc.next();
	String result="";
	for(int i=0;i<str.length();i++) {
		boolean isduplicate=false;
		for(int j=0;j<i;j++) {
			if(str.charAt(i)==str.charAt(j)) {
				isduplicate=true;
				break;
			}
		}
		if(!isduplicate) {
			result=result+str.charAt(i);
		}
		
	}
	System.out.println("After removing duplicate "+result);
}
}
