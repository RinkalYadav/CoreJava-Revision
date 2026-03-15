package com.basic.LogicAndMixed;

import java.util.Scanner;

public class CountWordInSentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String to count word");
	String str1=sc.nextLine();
	str1 = str1.trim();  // remove leading and trailing spaces
	 if(str1.isEmpty()) {
         System.out.println("0 words");
         return;
     }
	 String[] words = str1.split("\\s+");

     System.out.println("Entered string has " + words.length + " words");

}
}
