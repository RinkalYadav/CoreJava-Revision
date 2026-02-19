package com.basic.com;

public class SwapNumber2 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	System.out.println("Before swaping a = "+a);
	System.out.println("Before swaping b = "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("========================");
	System.out.println("After swaping a = "+a);
	System.out.println("After swaping b = "+b);
}
}
