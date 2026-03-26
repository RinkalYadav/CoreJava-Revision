package com.practice.coding.string;

import java.util.Scanner;

public class Palindrome2 {
public static void main(String[] args) {
	boolean isPalindrome = true;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();

	for (int i = 0; i < str.length() / 2; i++) {
	    if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
	        isPalindrome = false;
	        break;
	    }
	}
	  // ✅ Print result
    if (isPalindrome) {
        System.out.println("String is palindrome");
    } else {
        System.out.println("Not palindrome");
    }

    sc.close();
}
}
