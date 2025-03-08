package com.in28minutes.oops.level2.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {
    static <X> X doubleValue(X value){
        return value;
    }

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }
    public static void main(String[] args) {
    // MycustomList<String> list = new MycustomList<String>();
        MycustomList<Long> list = new MycustomList<Long>();
     list.addElement(10L);
     list.addElement(20L);
     System.out.println(list);


        //Integer type not allowed as MycustomList specific to String
        /*MycustomList list1 = new MycustomList();
        list1.addElement(Integer.valueOf(5));
        list1.addElement(Integer.valueOf(20));*/

        //After define generics
        MycustomList<Integer> list1 = new MycustomList<Integer>();
        list1.addElement(Integer.valueOf(5));
        list1.addElement(Integer.valueOf(20));
        System.out.println(list1);

        ArrayList<Integer> arrlist = new ArrayList<>(List.of(1,2,3));
        duplicate(arrlist);
        System.out.println(arrlist);

        LinkedList<Integer> lnklist = new LinkedList<>(List.of(5,6,7));
        duplicate(lnklist);
        System.out.println(lnklist);

    }
}
