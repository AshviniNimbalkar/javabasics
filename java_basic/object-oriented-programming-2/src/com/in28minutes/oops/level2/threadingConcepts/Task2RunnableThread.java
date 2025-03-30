package com.in28minutes.oops.level2.threadingConcepts;

public class Task2RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Task2 started");
        for (int i = 200; i <= 299; i++) {
            System.out.print(i+" ");
        }
        System.out.println("Task2 done");
    }
}
