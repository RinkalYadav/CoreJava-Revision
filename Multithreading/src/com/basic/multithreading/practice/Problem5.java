package com.basic.multithreading.practice;
class OddThread implements Runnable{
	public void run() {
		for(int i=1;i<10;i=i+2) {
			System.out.println(i);
		}
	}
}
class EvenThread implements Runnable{
	public void run() {
		for(int i=2;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
}
public class Problem5 {
public static void main(String[] args) {
	OddThread o=new OddThread();
	EvenThread e=new EvenThread();
	
	Thread t1= new Thread(o);
	Thread t2= new Thread(e);
	
	t1.start();
	t2.start();
}
}
