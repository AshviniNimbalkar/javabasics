package com.in28minutes.oops.level2.concurrency;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

class CopyOnwriteConcurrentRunner {
    public static void main(String[]args){
       List<String> list = new CopyOnWriteArrayList<>();
       list.add("Ant");
       list.add("Bat");
       list.add("Cat");
       for(String element:list){
        System.out.println(element);
       }
    }
}
