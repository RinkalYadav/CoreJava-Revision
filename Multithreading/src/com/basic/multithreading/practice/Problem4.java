package com.basic.multithreading.practice;
class HelloThread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("HelloThread");
		}
		
	}
}

class WelcomThread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("WelcomeThread");
		}
	}
}
public class Problem4 {
public static void main(String[] args) {
	HelloThread h=new HelloThread();
	WelcomThread w=new WelcomThread();
	Thread t1=new Thread(h);
	Thread t2=new Thread(w);
	t1.start();
	t2.start();
}
}
