package org.blitmatthew.counter;

public class Counter {
    private int count;
    public Counter() {
        this.count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
