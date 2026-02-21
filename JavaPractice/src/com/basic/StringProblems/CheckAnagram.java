package com.basic.StringProblems;
import java.lang.reflect.Array;
import java.util.Arrays;
// angram means when two string contain same character with the same frequency
import java.util.Scanner;

public class CheckAnagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a 1st string to check its anagram or not");
	String str1=sc.next();
	System.out.println("Enter a 2nd string to check its anagram or not");
	String str2=sc.next();
	
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	
	if(str1.length()!=str2.length()) {
		System.out.println("String is not anagram");
	}
	else {
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Stirng is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
	}
	
}
}
