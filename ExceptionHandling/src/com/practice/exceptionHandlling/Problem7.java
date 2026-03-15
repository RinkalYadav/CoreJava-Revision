package com.practice.exceptionHandlling;

import java.util.Scanner;

public class Problem7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
    int n=sc.nextInt();
    
    int arr[]=new int[3];
    
    
    try {
    	
        arr[n]=30;
        int result = 50/n;
        System.out.println("Result is "+result);
    }
    catch(ArithmeticException e) {
    	System.out.println("Can not be divided");
    }
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("Invalid array index");
    }
    catch (Exception e) {

        System.out.println("General exception");

    }

    finally {
    	System.out.println("Program completed");
    }
    sc.close();
}
}
