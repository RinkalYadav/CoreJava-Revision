package com.practice.collection.Set;

import java.util.HashSet;

public class HashSetProblem {
public static void main(String[] args) {
	HashSet<Integer> set=new HashSet<>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(10);
	
	System.out.println(set);
}
}
