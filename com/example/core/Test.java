package com.example.core;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Book b1=new Book();
        b1.author="Uppu";
        Book b2=new Book(100,"Java","James Gosling");
        b2.show();
        b2.show1("This is a Java Book");
        String temp=b2.show2("This is a Java Book");
        System.out.println("Temp: "+temp);
        System.out.println(b2.show2("Hello Uppu"));;
        Publisher p=new Publisher("OReilly","USA");
    }
}