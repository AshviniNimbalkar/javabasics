package com.in28minutes.oops.level2.functionalProgrammining;

import java.util.List;
import java.util.stream.Collectors;

public class CubeFirstNnums {

    List<Integer> findCube(List<Integer> list){
        return list.stream().map(num->num * num * num).collect(Collectors.toList());
    }
}
