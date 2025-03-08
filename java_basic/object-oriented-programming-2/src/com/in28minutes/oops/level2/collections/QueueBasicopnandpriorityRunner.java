package com.in28minutes.oops.level2.collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasicopnandpriorityRunner {
    public static void main(String[]args){
        Queue<String> queue = new PriorityQueue<>();
        System.out.println(queue.poll());
        System.out.println(queue.add("Apple"));
        System.out.println(queue.offer("Banana"));
        queue.poll();
        System.out.println(queue);
        queue.addAll(List.of("Zebra","Monkey","Cat"));
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
