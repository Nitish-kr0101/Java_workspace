package com.example.exception;

public class SampleMulti {

    public static void main(String[] args) {

        try {

            int x = 2;

            int y = 10;

            int z = y / x;

            System.out.println(z);

            int[] num = new int[5];

            num[4] = 100;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException x) {

            System.out.println(x.getMessage());

        } catch (Exception x) {

            System.out.println("Array issue");

            System.out.println(x.getMessage());

        } finally {

            System.out.println("Compulsory execution");

        }

    }

}
