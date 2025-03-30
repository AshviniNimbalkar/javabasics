package com.in28minutes.oops.level2.threadingConcepts;

public class BasicThreadRunner {
    public static void main(String[]args) throws InterruptedException {
       /* //Task1
        for (int i = 1; i <= 199; i++) {
            System.out.println(i+" ");
        }*/

        Task1Thread task1 = new Task1Thread();
        task1.start();
        //Task2
        /*System.out.println("Task2 started");
        for (int i = 200; i <= 299; i++) {
            System.out.print(i+" ");
        }
        System.out.println("Task2 done");*/
        Task2RunnableThread task2 = new Task2RunnableThread();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);

        task2Thread.start();
        Thread.sleep(10000);
        task1.join();

        //Task3
        System.out.println("Task3 started");
        for (int i = 300; i <= 399; i++) {
            System.out.print(i+" ");
        }
        System.out.println("Task3 done");
    }
}
