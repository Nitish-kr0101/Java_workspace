package com.example.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestPainter {
    public static void main(String[] args) {
        List<Painter> painterList = new ArrayList<Painter>();
        Random random = new Random();
        int size = 100;
        String[] names = {"John", "Rakeeb", "Jane", "David", "Rahul", "Peter", "Leo", "Zack", "Anita", "Samaira"};
        String[] style = {"oil", "charcole", "pencil", "colored", "ink", "glass", "sand", "spray", "digital", "watrecolor"};
        String[] themes = {"Environment", "Industry", "Social", "Invention", "Adversity", "Humans", "Progress"};

        for (int i = 0; i < 1000000; i++) {
            int randomName = random.nextInt(names.length - 1);
            int randomStyle = random.nextInt(style.length - 1);
            int randomTheme = random.nextInt(themes.length - 1);
            painterList.add(new Painter(names[randomName], style[randomStyle], themes[randomTheme]));
        }

        long t1 = System.currentTimeMillis(), count1;

        count1 = painterList.stream().
                filter(x -> (x.getName().equals("John") || x.getPaintingStyle().equals("charcole")))
                .filter(x -> x.getTheme().equals("Invention"))
                .filter(x -> x.getName().startsWith("J"))
                .count();
        long t2 = System.currentTimeMillis();
        System.out.println("Count = " + count1 + " sequential Stream Takes " + (t2 - t1) + " ms\n");

        long t3 = System.currentTimeMillis(), count2;
        count2 = painterList.parallelStream().
                filter(x -> (x.getName().equals("John") || x.getPaintingStyle().equals("charcole")))
                .filter(x -> x.getTheme().equals("Invention"))
                .filter(x -> x.getName().startsWith("J"))
                .count();
        long t4 = System.currentTimeMillis();
        System.out.println("Count = " + count2 + " Parallel Stream Takes " + (t4 - t3) + " ms\n");
    }
}