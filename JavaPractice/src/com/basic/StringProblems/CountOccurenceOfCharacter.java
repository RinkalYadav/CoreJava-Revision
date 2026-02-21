package com.basic.StringProblems;

import java.util.Scanner;

public class CountOccurenceOfCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {

            boolean alreadyCounted = false;

            // Check if this character appeared before
            for(int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted) {
                continue;
            }

            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " occurs " + count + " times");
        }
    }
}