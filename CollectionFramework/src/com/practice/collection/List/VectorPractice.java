package com.practice.collection.List;

import java.util.Vector;

public class VectorPractice {
public static void main(String[] args) {
	Vector<Integer> list=new Vector<>();
	list.add(10);
	list.add(20);
	list.add(30);
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
}
}
