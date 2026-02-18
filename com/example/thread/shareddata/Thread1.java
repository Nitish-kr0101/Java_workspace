package com.example.thread.shareddata;

public class Thread1 extends Thread{
    PrintEvenNum obj;
    public Thread1(PrintEvenNum obj){
        this.obj = obj;
}
public void run(){
    obj.printNum();
}
}
