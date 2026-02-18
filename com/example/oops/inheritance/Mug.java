package com.example.oops.inheritance;

public class Mug {
    public void addLiquid(Liquid l){
        //System.out.println("Adding liquid to the mug");
        //l.swirl();
        if(l instanceof Coffee)
            System.out.println("swirling coffee");
        else if(l instanceof Tea)
            System.out.println("swirling tea");
        else
            System.out.println("general liquid");}

    public void addJuice(Juice j){

        j.swirl();
    }
}