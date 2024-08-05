package org.blitmatthew;

import org.blitmatthew.counter.Counter;
import org.blitmatthew.counter.CounterThread;
import org.blitmatthew.runnables.FormCallable;
import org.blitmatthew.runnables.TimeCounterRunnable;
import org.blitmatthew.vehicle.Car;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*Car car = new Car(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the car Travelled game
                Goal is to get the car going and travelling
                1) Turn on car
                2) Turn off car
                3) Speed up
                4) Slow Down
                5) Exit Game
                """);
        while(true) {
            int input = scanner.nextInt();
            switch(input) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.turnOff();
                    break;
                case 3:
                    car.speedUp();
                    break;
                case 4:
                    car.brake();
                    break;
                case 5:
                    System.exit(0);
            }
        }*/

        Counter counter = new Counter();
////
        Thread thread = new CounterThread(counter);
        Thread thread1 = new CounterThread(counter);
//
//        thread.start();
//        thread1.start();
//
//        try {
//            thread.join();
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//    Thread thread = new Thread(new TimeCounterRunnable());
//
//    thread.start();
//
//    System.out.println(thread.getState());
//    thread.join();
//    System.out.println(thread.getState());

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Future<Integer> future = executorService.submit(new FormCallable());
//
//        executorService.submit(thread);
//        executorService.submit(thread1);
//
//        executorService.submit(thread);
//        executorService.submit(thread1);
//
//        try {
//            System.out.println("Result: " +future.get());
//            System.out.println("Result: " + future.get());
//            System.out.println("Result: " +future.get());
//            System.out.println("Result: " + future.get());
//            System.out.println("Result: " +future.get());
//            System.out.println("Result: " + future.get());
//            System.out.println("Result: " +future.get());
//            System.out.println("Result: " + future.get());
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        executorService.shutdown();

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            return sum;
        });

        System.out.println("Result: " + future.get());
    }
}