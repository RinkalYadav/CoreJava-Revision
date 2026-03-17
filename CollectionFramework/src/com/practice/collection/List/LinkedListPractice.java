package com.practice.collection.List;

import java.util.LinkedList;

public class LinkedListPractice {
public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	System.out.println(list);
	list.addFirst(5);
	System.out.println(list);
	list.addLast(40);
	System.out.println(list);
	list.removeFirst();
	System.out.println(list);
}
}
