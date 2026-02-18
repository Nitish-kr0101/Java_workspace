package com.example.oops.Interface;

public class Employee extends Person implements Artist,Player{
    int empId;

    @Override
    public void doArt() {
        System.out.println("Employee is doing art");
    }

    @Override
    public void doPlay() {
        System.out.println("Employee is playing");
    }

    @Override
    public void coach() {
        System.out.println("Employee is coaching");
    }
}
