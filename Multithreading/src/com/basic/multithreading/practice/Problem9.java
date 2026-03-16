package com.basic.multithreading.practice;

class Thread1 implements Runnable {

    public void run() {

        System.out.println(Thread.currentThread().getName() +
                           " Priority: " +
                           Thread.currentThread().getPriority());

    }
}

class Thread2 implements Runnable {

    public void run() {

        System.out.println(Thread.currentThread().getName() +
                           " Priority: " +
                           Thread.currentThread().getPriority());

    }
}

public class Problem9 {

    public static void main(String[] args) {

        Thread1 ob1 = new Thread1();
        Thread2 ob2 = new Thread2();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}