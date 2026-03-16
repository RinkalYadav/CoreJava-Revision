package com.basic.multithreading.practice;
class task1 implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Task 1");
		}
		
	}
}
class task2 implements Runnable{
	public void run() {
		System.out.println("Task 2");
	}
}
public class Problem8 {
public static void main(String[] args) throws Exception {
	task1 ob1=new task1();
	task2 ob2=new task2();
	
	Thread t1=new Thread(ob1);
	Thread t2=new Thread(ob2);
	
	t1.start();
	t1.join();
	t2.start();
}
}
