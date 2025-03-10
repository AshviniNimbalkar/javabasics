package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;
import java.util.stream.IntStream;

public class StreamIntermediateOperationRunner {
    public static void main (String[]args){
        List<Integer>  list = List.of(5,10,5,20,22,3,1);
        list.stream().sorted().forEach(element -> System.out.println(element));
        List<Integer>  list1 = List.of(5,10,5,20,22,3,1);
        list1.stream().distinct().forEach(element -> System.out.println(element));
        //map all to lowercase and print them
        List<String> lowercasestr = List.of("Apple","Bat","cat");
        lowercasestr.stream().map(element -> element.toLowerCase()).forEach(element -> System.out.println(element));
        lowercasestr.stream().forEach(element -> System.out.println(element.length()));
        IntStream.range(1,11).forEach(element -> System.out.println(element *element));

    }
}
