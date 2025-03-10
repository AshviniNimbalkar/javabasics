package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;

public class CollectSumRunner {
    public static void main(String[]args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        Integer sum =  list.stream().filter(element -> element%2 ==0).reduce(0,(number1,number2) -> number1 + number2);
        System.out.println(sum);
    }
}
