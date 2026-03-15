package com.basic.interviewProblem;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number till print fibnocci series ");
	int n=sc.nextInt();
	
	int fst=0;
	int snd=1;
	for(int i=1;i<=n;i++) {
		System.out.print(fst+" ");
	   int nxt=fst+snd;
	   fst=snd;
	   snd=nxt;
	   
	}
	sc.close();
}
}
