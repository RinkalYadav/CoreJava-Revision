package com.basic.ArraysProblem;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element in array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered the array is ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	
	boolean isPalindrome=true;
  
	int start=0;
	int end=n-1;
	while(start<end) {
		if(arr[start] != arr[end]) {
			isPalindrome=false;
			break;
		}
		start++;
		end--;
		
	}
	System.out.println();
	if(isPalindrome){
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
	
}
}
