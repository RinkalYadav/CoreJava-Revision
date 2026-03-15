package com.basic.multithreading.practice;
class Problem2MyRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Runnable Thread: "+i);
		}
	}
}
public class Problem2 {
public static void main(String[] args) {
	Problem2MyRunnable ob=new Problem2MyRunnable();
	Thread t=new Thread(ob);
	t.start();
	
}
}
