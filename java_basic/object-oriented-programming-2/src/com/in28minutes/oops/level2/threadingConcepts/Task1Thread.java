package com.in28minutes.oops.level2.threadingConcepts;

public class Task1Thread extends Thread{
    public void run(){
        System.out.println("Task1 started");
        for (int i = 1; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Task1 done");
    }
}
