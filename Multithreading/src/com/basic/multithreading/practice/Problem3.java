package com.basic.multithreading.practice;
class Problem3MyThread implements Runnable{
	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			
		}
	}
}
public class Problem3 {
public static void main(String[] args) {
	Problem3MyThread ob=new Problem3MyThread();
	Thread t=new Thread(ob);
	t.start();
}
}
