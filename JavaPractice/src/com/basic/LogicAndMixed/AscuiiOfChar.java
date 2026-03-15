package com.basic.LogicAndMixed;

import java.util.Scanner;

public class AscuiiOfChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character to print its ascuii number");
	char ch=sc.next().charAt(0);
	
	int n=ch;
	System.out.println("ASCII value of " + ch + " is: " + n);
}
}
