package com.practice.collection.List;

import java.util.ArrayList;

public class Practice2 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Rinkal");
	list.add("Rajan");
	list.add("Rishi");
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println("=====================");
	for(String name : list) {
		System.out.println(name);
	}
}
}
