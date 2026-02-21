package com.basic.StringProblems;

import java.util.Scanner;

public class PrintDuplicateCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove duplicate characters");

        String str = sc.next();
        String result = "";

        for(int i=0;i<str.length();i++) {
        	boolean isduplicate=false;
        	for(int j=i+1;j<str.length();j++) {
        		if(str.charAt(i)==str.charAt(j)) {
        			isduplicate=true;
        		}
        	}
        	if(isduplicate==true) {
        		result=result+str.charAt(i);
        	}
        	
        }
        System.out.println("Duplicate value is "+result);
    }
}