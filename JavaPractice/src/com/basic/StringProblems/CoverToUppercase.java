package com.basic.StringProblems;

import java.util.Scanner;

public class CoverToUppercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to convert into upercase");
		String str=sc.next();
		String result="";
		for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // check if character is lowercase
            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        System.out.println("Uppercase String: " + result);
    
	}
}
