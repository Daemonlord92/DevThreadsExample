package org.blitmatthew.runnables;

import java.util.concurrent.Callable;

public class FormCallable  implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int noOfTimes = 10;
        int product = 1;
        for (int i = 1; i <= noOfTimes; i++) {
            product += i;
            Thread.sleep(1000);
        }
        return product;
    }
}
