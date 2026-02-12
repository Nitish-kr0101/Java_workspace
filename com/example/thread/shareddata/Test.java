package com.example.thread.shareddata;

public class Test {
    public static void main(String[] args) {
        PrintEvenNum obj = new PrintEvenNum();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
