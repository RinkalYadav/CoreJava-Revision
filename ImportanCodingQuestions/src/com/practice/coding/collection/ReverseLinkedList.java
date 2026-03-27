package com.practice.coding.collection;

import java.util.LinkedList;

public class ReverseLinkedList {
public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<>();
	list.add(20);
	list.add(40);
	list.add(60);
	list.add(10);
	list.add(80);
	list.add(50);
	System.out.println("Entered linked list is ");
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
	System.out.println();
	System.out.println("Entered linked list is in reverse");
	for(int i=list.size()-1;i>=0;i--) {
		System.out.print(list.get(i)+" ");
	}
	
	
}
}
