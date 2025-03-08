package com.in28minutes.oops.level2.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[]args){
        Map<String,Integer> map = Map.of("A",1,"B",5,"D",5);
        System.out.println(map);
        Map<String,Integer> hashmap = new HashMap<>(map);
        hashmap.put("K" ,4);
        System.out.println(hashmap);
        System.out.println(hashmap.get("K"));
        System.out.println(hashmap.containsKey("C"));
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());
        System.out.println( hashmap.put("K" ,15));
        System.out.println(hashmap.put("S",20));


    }
}
