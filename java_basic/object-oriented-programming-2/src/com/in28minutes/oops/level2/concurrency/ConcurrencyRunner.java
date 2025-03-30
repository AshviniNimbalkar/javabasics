package com.in28minutes.oops.level2.concurrency;

public class ConcurrencyRunner {
    public static void main(String[]args){
        Counter cntr = new Counter();
        cntr.increment();
        cntr.increment();
        cntr.getI();
    }




}
