package com.basic.multithreading.practice;
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Runnable thread is running "+Thread.currentThread().getName());
	}
}

public class ImplementinThread {
public static void main(String[] args) {
	
	MyRunnable obj=new MyRunnable();
	
	Thread t=new Thread(obj);
	t.start();
}
}
