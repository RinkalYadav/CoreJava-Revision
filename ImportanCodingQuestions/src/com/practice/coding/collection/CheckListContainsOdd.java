package com.practice.coding.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckListContainsOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> list=new ArrayList<>();
	
	System.out.println("Enter number of elements:");
	int n = sc.nextInt();

	
	System.out.println("Enter element in the list");
	for(int i=0;i<n;i++) {
		list.add(sc.nextInt());
	}
	
	System.out.println("The list elements is ");
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
	System.out.println();
	int count=0;
	for(int i:list) {
		if(i%2==0) {
			count++;
			break;
		}
	}
	if(count>0) {
		System.out.println("List contains even number also");
	}
	else {
		System.out.println("List only contains odd number");
	}
	
}
}
