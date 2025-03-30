package com.in28minutes.oops.level2.threadingConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[]args) throws InterruptedException {
        ExecutorService ExService = Executors.newSingleThreadExecutor();
        Task1Thread task1= new Task1Thread();
        Task2RunnableThread task2 = new Task2RunnableThread();
        Thread task2th  = new Thread(task2);
        ExService.execute(task1);
        ExService.execute(task2th);

        Task3Thread task3 = new Task3Thread();
        task1.join();
        task2th.join();
        task3.start();
        ExService.shutdown();

    }
}
