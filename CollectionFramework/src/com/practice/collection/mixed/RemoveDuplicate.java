package com.practice.collection.mixed;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add(30);
	list.add(20);
	list.add(40);
	
	System.out.println(list);
	
	HashSet<Integer> set=new HashSet<>(list);
	System.out.println(set);
	ArrayList<Integer> list1=new ArrayList<>(set);
	System.out.println(list1);
	
//	for(int i=0;i<list.size();i++) {
//		set.add(list.get(i));
//	}
//	
//	System.out.println(set);
}
}
