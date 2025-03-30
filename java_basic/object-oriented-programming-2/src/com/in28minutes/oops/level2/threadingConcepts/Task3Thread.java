package com.in28minutes.oops.level2.threadingConcepts;

public class Task3Thread extends Thread{
    public void run(){
        System.out.println("Task3 started");
        for (int i = 300; i <= 399; i++) {
            System.out.print(i+" ");
        }
        System.out.println("Task3 done");
    }
}
