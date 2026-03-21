package com.practice.coding.factorial;

public class SumNatural {
	
	static int sum(int n) {
		if(n==0) return 0;
		return n+sum(n-1);
	}
public static void main(String[] args) {
	int re=sum(10);
	System.out.println(re);
}
}
