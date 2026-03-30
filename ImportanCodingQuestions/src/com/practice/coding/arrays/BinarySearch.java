package com.practice.coding.arrays;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	boolean found=false;
	System.out.println("Enter the element in array element should be in sorted array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Entered array is ");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	int low=0;
	int high=n-1;
	System.out.println("Enter the element which you want to find");
	int target=sc.nextInt();
	
	while(low<=high) {
		int mid=(low+high)/2;
		if(target==arr[mid]) {
			System.out.println("Item found");
			found = true; 
			break;
		}
		else if(target<arr[mid]) {
			high=mid-1;			
		}
		else {
			low=mid+1;
			}
		
	}
	if(!found) {
		System.out.println("Item not found");
	}
	
}
}
