package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public List<Integer> filterOddNum(List<Integer> list){
       return  list.stream().filter(number -> number%2 !=0).collect(Collectors.toList());
    }
}
