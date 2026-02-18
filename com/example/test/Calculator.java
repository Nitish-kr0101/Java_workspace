package com.example.test;

public class Calculator {
    public int findBig(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public int findSmall(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}
