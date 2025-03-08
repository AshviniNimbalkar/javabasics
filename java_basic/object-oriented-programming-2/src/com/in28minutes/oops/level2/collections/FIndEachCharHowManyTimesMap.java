package com.in28minutes.oops.level2.collections;

import java.util.HashMap;
import java.util.Map;

public class FIndEachCharHowManyTimesMap {
    public static void main(String[]args){
        String str = "This is an awesome occasion. "+"This has never happened before. ";
        Map<Character,Integer> occurances = new HashMap<>();
        char[] charesters = str.toCharArray();
        for(char charcter : charesters){
            Integer integer = occurances.get(charcter);
            if(integer==null){
                occurances.put(charcter,1);
            }else{
                occurances.put(charcter,integer+1);
            }
        }
        System.out.println(occurances);
    }
}
