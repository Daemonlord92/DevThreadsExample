package org.blitmatthew.runnables;

import java.time.LocalTime;

public class TimeCounterRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i + " - " + LocalTime.now());
            System.out.println(Thread.currentThread().getState() + " - " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
