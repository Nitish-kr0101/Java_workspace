package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Upasana");
        map.put(102,"David");
        map.put(103,"David");
        map.put(101,"Virat");
        System.out.println(map);
    }
}
