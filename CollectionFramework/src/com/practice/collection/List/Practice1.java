package com.practice.collection.List;

import java.util.ArrayList;

public class Practice1 {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(100);
	list.add(20);
	list.add(23);
	list.add(67);
	list.add(76);
	
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	
	 System.out.println("Elements using loop:");
     for(int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
     }
	
}
}
