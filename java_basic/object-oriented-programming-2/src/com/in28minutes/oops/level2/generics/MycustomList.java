package com.in28minutes.oops.level2.generics;

import java.util.ArrayList;

public class MycustomList <T extends Number> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
        list.add(element);

    }
    public  void removeElement(T element){
        list.remove(element);
    }
}
