package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;

public class CubeRunner {
    public static void main(String[]args){
        CubeFirstNnums findCube = new CubeFirstNnums();
       List<Integer> list =  findCube.findCube(List.of(1,2,3,4,5));
       list.stream().forEach(number -> System.out.println(number));
    }
}
