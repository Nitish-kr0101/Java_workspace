package com.example.thread.shareddata;

public class PrintEvenNum {
    static int i;
    public void printNum(){
        for(i=0; i<20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
