package com.in28minutes.oops.level2.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[]args){
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        map.put("A",15);
        map.put("B",25);
        map.put("F",25);
        map.put("G",25);
        System.out.println(map);
        System.out.println(map.higherKey("B"));
        System.out.println(map.ceilingKey("B"));
        System.out.println(map.lowerKey("B"));
        System.out.println(map.floorKey("B"));

    }
}
