package com.example.exception;

import java.sql.SQLOutput;

public class Sample {
    public static void main(String[] args) {
        try{
            int x=0;
            int y=10;
            int z=y/x;
            System.out.println();
            int[] num=new int[5];
            num[4]=100;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception handled");
        }
        catch(ArrayIndexOutOfBoundsException x)
        {
            System.out.println("Array issue");
            System.out.println(x.getMessage());
        }
         catch(Exception x)
          {
                System.out.println("Array issue");
              System.out.println(x.getMessage());
          }
            finally
            {
                 System.out.println("i will get executed no matter what");
            }
    }
}
