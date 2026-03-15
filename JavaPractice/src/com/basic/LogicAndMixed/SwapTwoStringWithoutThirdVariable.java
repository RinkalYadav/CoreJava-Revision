package com.basic.LogicAndMixed;

import java.util.Scanner;

public class SwapTwoStringWithoutThirdVariable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st String ");
	String str1=sc.next();
	System.out.println("Enter 2nd String ");
	String str2=sc.next();
	
	 System.out.println("Before Swapping:");
     System.out.println("str1 = " + str1);
     System.out.println("str2 = " + str2);
	
     str1=str1+str2;
     // Step 2: Extract original str1 into str2
     str2 = str1.substring(0, str1.length() - str2.length());

     // Step 3: Extract original str2 into str1
     str1 = str1.substring(str2.length());

     System.out.println("After Swapping:");
     System.out.println("str1 = " + str1);
     System.out.println("str2 = " + str2);
}
}
