package com.in28minutes.oops.level2.collections;

import java.util.List;

public class ListDemo {
    public static void main(String[]args){
        List<String> list = List.of("Apple","Bat","Cat");
        System.out.println(list.size());
        System.out.println(list.indexOf("Cat"));
        System.out.println(list.get(1));
        System.out.println(list.contains("Mat"));
        System.out.println(list.contains("Bat"));
    }
}
