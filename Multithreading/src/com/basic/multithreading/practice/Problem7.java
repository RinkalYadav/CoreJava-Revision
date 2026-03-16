package com.basic.multithreading.practice;
class Counter1{
	int count=0;
	public synchronized void increment() {
		count++;
		
	}
}

class Problem7Thread implements Runnable {
	Counter counter;
	Problem7Thread(Counter counter){
		this.counter=counter;
	}
	public void run() {
		 for(int i = 0; i < 1000; i++) {
	            counter.increment();
	        }
	}
}
public class Problem7 {
public static void main(String[] args) throws Exception  {
	   Counter counter = new Counter();
	   Problem7Thread obj = new Problem7Thread(counter);
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	
	
	t1.start();
	t2.start();
	
	 t1.join();
     t2.join();

     System.out.println("Counter = " + counter.count);

}
}
