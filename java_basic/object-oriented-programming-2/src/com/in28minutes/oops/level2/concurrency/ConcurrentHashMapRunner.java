package com.in28minutes.oops.level2.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapRunner {
    public static void main(String[]args){
        ConcurrentHashMap<Character, LongAdder>  ocurances = new ConcurrentHashMap<>();
        String str = "ABCD ABCD ABCD";
        for(char character:str.toCharArray()){
            ocurances.computeIfAbsent(character,ch->new LongAdder()).increment();

        }
        System.out.println(ocurances);
    }
}
