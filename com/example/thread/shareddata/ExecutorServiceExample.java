package com.example.thread.shareddata;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService eServe1 = Executors.newFixedThreadPool(10);

        Future<?> futu1 = eServe1.submit(() -> {
            for (int i = 1; i <= 4; i++) {
                for (int j = 4; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Runnable ending");
        });

        Future<Integer> futu2 = eServe1.submit(() -> {
            System.out.println("I printed summation, I am Callable");
            return 100 + 200 + 300 + 23;
        });

        try {
            Integer result = futu2.get(5, TimeUnit.SECONDS);
            System.out.println("The summation is: " + result);
            someFunnyTask(" having fun!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            eServe1.shutdown();
        }
    }

    private static void someFunnyTask(String funnyName) {
        System.out.println("I'm not from ExecutorService " + funnyName);
    }
}
