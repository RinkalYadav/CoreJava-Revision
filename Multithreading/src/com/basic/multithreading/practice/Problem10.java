package com.basic.multithreading.practice;

class YieldThread implements Runnable {

    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " : " + i);

            Thread.yield();   // give chance to other thread

        }

    }
}

public class Problem10 {

    public static void main(String[] args) {

        YieldThread obj = new YieldThread();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

    }
}