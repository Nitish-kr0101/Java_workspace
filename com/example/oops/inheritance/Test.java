package com.example.oops.inheritance;

public class Test {
    public static void main(String[] args) {
        Liquid l= new Liquid();
        Coffee c= new Coffee();
        Tea t= new Tea();
        Mug m= new Mug();
        Juice j= new Juice();
        m.addLiquid(l);
        m.addLiquid(c);
        m.addLiquid(t);
        m.addJuice(j);
        String[] names=new String[5];
        Liquid[] list=new Liquid[3];
        list[0]=l;
        list[1]=c;
        list[2]=t;

    }
}