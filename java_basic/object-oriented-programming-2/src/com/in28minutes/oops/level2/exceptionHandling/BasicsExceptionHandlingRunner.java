package com.in28minutes.oops.level2.exceptionHandling;

import java.util.Scanner;

public class BasicsExceptionHandlingRunner {
    public static void main(String[]args){

       method2();
        System.out.println("After method2 call");
    }

    private static void method2() {
        method1();
        System.out.println("After method1 call");
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);
        try {
            String str = null;
            str.length();

        }catch(NullPointerException ex){
            System.out.println("Matched Nullpointer exception");
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            if(sc!=null)
            sc.close();
        }
    }
}
