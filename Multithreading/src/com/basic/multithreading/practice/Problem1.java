package com.basic.multithreading.practice;

class Problem1MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
public class Problem1 {
public static void main(String[] args) {
	Problem1MyThread ob=new Problem1MyThread();
	ob.start();
}
}
