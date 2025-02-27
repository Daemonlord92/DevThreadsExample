package org.blitmatthew.counter;

public class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 30; i++){
            counter.increment();
            System.out.println(this.getName() + " " + counter.getCount());
        }
    }
}
