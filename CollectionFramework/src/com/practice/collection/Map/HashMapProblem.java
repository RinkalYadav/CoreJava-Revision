package com.practice.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblem {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<>();
	map.put(1, "rinkal");
	map.put(2, "Rajan");
	map.put(3, "Rishi");
	
//	for(Map.Entry<Integer, String> entry : map.entrySet()) {
//	    System.out.println(entry.getKey() + " " + entry.getValue());
//	}
	
	for(Map.Entry<Integer, String> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + " " + entry.getValue());
	}
}
}
