package com.in28minutes.oops.level2.newjavafeatures;

import java.util.List;

public class TypeInferenceRunner {
    public static  void main(String[]args){
        List<String> names1 = List.of("Rajveer","Ranjit");
        List<String> names2 = List.of("Ashvini");
        var newList = List.of(names1,names2);
        newList.stream().forEach(name -> System.out.println(name));
        //type inference is applicable to local verials only

    }
}
