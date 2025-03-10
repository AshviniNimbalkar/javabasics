package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;
import java.util.stream.Collectors;

public class TerminaloperationRunner {
    public static void main(String[]args){
        List<Integer> intList = List.of(1,2,3,4,5);
        int sum = intList.stream().reduce(0,(num1,num2)->(num1+num2));
        System.out.println(sum);
        System.out.println(intList.stream().max((n1,n2)->Integer.compare(n1,n2)).get());
        List<Integer> list = intList.stream().filter(element -> element%2==0).collect(Collectors.toList());
        list.stream().forEach(element -> System.out.println(element));
    }
}
