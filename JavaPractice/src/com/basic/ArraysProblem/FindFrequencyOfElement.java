package com.basic.ArraysProblem;

import java.util.Scanner;

public class FindFrequencyOfElement {
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
	System.out.println();
	boolean visited[]=new boolean[n];
	for(int i=0;i<n;i++) {
		int count=1;
		if(visited[i]) {
			continue;
			
		}
		for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				count++;
				visited[j]=true;
			}
		}
		System.out.println("frequency of "+arr[i]+" is "+count);
	}
}
}
