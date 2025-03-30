package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;

public class FilteroddNumRunner {
    public static void main(String []args){
       FilterOddNumbers filteroddNum = new FilterOddNumbers();
       List<Integer> list = filteroddNum.filterOddNum(List.of(1,2,3,4,5,6,7));
       list.stream().forEach(number -> System.out.println(number));


    }
}
