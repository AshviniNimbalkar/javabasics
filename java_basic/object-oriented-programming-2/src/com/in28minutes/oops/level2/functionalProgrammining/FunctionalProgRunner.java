package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;

public class FunctionalProgRunner {
    public static void main(String[]args){
        List<String> list = List.of("Apple","Banana","Cat");
        printWithFP(list);
        printbasic(list);
    }

    private static void printbasic(List<String> list) {
        for(String str : list){
            System.out.println(str);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element->System.out.println(element));
    }
}
