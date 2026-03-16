package com.basic.multithreading.practice;
class Counter{
	int count=0;
	public void increment() {
		count++;
		
	}
}

class Problem6Thread implements Runnable {
	Counter counter;
	Problem6Thread(Counter counter){
		this.counter=counter;
	}
	public void run() {
		 for(int i = 0; i < 1000; i++) {
	            counter.increment();
	        }
	}
}
public class Problem6 {
public static void main(String[] args) throws Exception  {
	   Counter counter = new Counter();
	   Problem6Thread obj = new Problem6Thread(counter);
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	
	
	t1.start();
	t2.start();
	
	 t1.join();
     t2.join();

     System.out.println("Counter = " + counter.count);

}
}
