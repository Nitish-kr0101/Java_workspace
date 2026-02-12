package com.example.streams1;

public class Sample {
    int x;
    public Sample setX(int a)
    {
        this.x=a;
        return this;
    }
    public Sample incrementX(){
        this.x++;
        return this;
    }
    public void show()
    {
        System.out.println(this.x);
    }
}