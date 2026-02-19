package com.basic.com;
import java.util.Scanner;
public class CheckVowelOrConsonent {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character to know character is vowel of consonent");
	char ch=sc.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
		System.out.println("Entered character is Vowel");
	}
	else {
		System.out.println("entered character is consonent");
	}
}
}
