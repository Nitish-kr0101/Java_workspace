package com.example.thread.shareddata;

public class Thread2 extends Thread{
    PrintEvenNum obj;
    public Thread2(PrintEvenNum obj){
        this.obj = obj;
    }
    public void run(){
        obj.printNum();
    }
}
