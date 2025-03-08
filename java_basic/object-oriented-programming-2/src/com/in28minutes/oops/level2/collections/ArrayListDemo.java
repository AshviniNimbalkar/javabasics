package com.in28minutes.oops.level2.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[]args) {
        List<String> words = List.of("Cat", "Dog", "Horse");
        List<String> list = new ArrayList<String>(words);
        list.add("Elephant");
        list.get(3);
        list.set(3,"Bat");
        list.add(4,"Apple");
        list.remove("Apple");
        list.remove(0);

        System.out.println(list.size());
        System.out.println(list);
    }
}
