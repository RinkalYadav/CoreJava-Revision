package com.basic.StringProblems;

import java.util.Scanner;

public class FindFirstNonRepeatedCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string to find first non repeated character");
	String str=sc.next();
	for(int i=0;i<str.length();i++) {
		int count=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if(count == 1) {
            System.out.println("First non repeated character is: " + str.charAt(i));
            break;
        }
	}
}
}
