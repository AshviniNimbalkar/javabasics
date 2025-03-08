package com.in28minutes.oops.level2.collections;

import java.util.*;

public class SetRunner {
    public static void main(String[]args){
        List<Character> characters = List.of('A','Z','A','B','Z','F');
        //Sorted order
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet);
        //store in insertion order
        Set<Character> linkedhashet = new LinkedHashSet<>(characters);
        System.out.println(linkedhashet);
        //Dont care insertion order or sorted order
        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println(hashSet);
    }
}
