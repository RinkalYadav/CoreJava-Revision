package com.basic.multithreading.practice;
// it is the program to show how we can extend the thread class to use thread
class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is running "+Thread.currentThread().getName());
	}
}
public class ExtendingThread  {
public static void main(String[] args) {
	MyThread thread=new MyThread();
	thread.start();
}
}
