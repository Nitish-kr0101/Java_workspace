package com.example.oops.encapsulation;

public class Mobile {
    //bundleing of data +code

    //Data
    private int id;
    private String brand;
    private int RAM;
    public int color;
    String hardDrive; //only within encapsulation Pack
    protected boolean explore;
    //Code

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int RAM) {
        if(RAM<=0)
        {
            System.out.println("invalid RAM");
        }
        else{
            this.RAM=RAM;
        }
    }
}
