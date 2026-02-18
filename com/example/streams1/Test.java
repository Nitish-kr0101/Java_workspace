package com.example.streams1;

public class Test {
    public static void main(String[] args) {
        Sample obj=new Sample();
        obj.setX(10);
        obj.incrementX();
        obj.show();
        new Sample().setX(100).incrementX().show();
    }
}