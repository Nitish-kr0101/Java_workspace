package com.example.thread;

public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyTask my = new MyTask();
        Thread t2 = new Thread(my);
        t2.start();
    }
}
