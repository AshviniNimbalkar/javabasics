package com.in28minutes.oops.level2;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
//import java.util.List;

import static java.util.Collections.*;

class Client{
   int clientid=0;
   public Client (int id ){
       this.clientid = id;
   }
}
class person{

}
public class Javatips {
    class InnerClass{

    }

    static  class StaticInnerClass{

    }

    public static void main(String[]args){
        //import
        BigDecimal bg;
        //Collections.sort();
        //static import
       // sort(List.of("Apple","Banana","Aam"));
        //Blocks
        {

        }

        //equals method
        Client c1 = new Client(10);
        Client c2 = new Client(20);
        System.out.println(c1.equals(c2));

        //hash code
        //accessmodifier
        //finalnonaccess modifier
        //static final-constants
        //nested class
            StaticInnerClass stInnerClass = new StaticInnerClass();
            Javatips javatips = new Javatips();
           InnerClass innerClass=  javatips.new InnerClass();
           //Anonymous class
        //Enums
        }


}
