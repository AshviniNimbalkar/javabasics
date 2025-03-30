package com.in28minutes.oops.level2.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int i = 0;
    Lock lockfori = new ReentrantLock();
    synchronized public void increment(){
        lockfori.lock();
        i++;
        lockfori.unlock();
    }
    public int getI(){
        return i;
    }
}
