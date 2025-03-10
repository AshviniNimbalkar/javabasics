package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;

public class FilteringRunner {
    public static void main(String[]args){
        List<String> list = List.of("Apple","Banana","Cat");
        list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));

        List<Integer> list1 = List.of(12,5,22,34,17);
        list1.stream().filter(element -> element%2==1).forEach(element -> System.out.println(element));
        list1.stream().filter(element -> element %2 == 0).forEach(element -> System.out.println(element));
    }
}
