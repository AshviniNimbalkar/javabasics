package com.in28minutes.oops.level2.interfaces;

import java.util.List;

public class FlyableRunner {
    public static void main(String[]args){
        Flayable [] flayable = {new Airoplane(),new Bird()};
        for(Flayable object : flayable){
            object.fly();
        }

    }
}
