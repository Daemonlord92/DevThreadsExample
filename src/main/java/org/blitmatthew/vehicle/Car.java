package org.blitmatthew.vehicle;

public class Car {
    private Integer speed;
    private Boolean isOn;
    private final Integer acceleration;
    private Integer milesTraveled;
    private Boolean isMoving;

    public Car(Integer acceleration){
        this.acceleration = acceleration;
        this.speed = 0;
        this.isOn = false;
        this.milesTraveled = 0;
        this.isMoving = false;
    }

    public void start() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void speedUp() {
        if(!isMoving && isOn){
            this.isMoving = true;
            Thread moving = new Thread(() -> {
                while(isMoving) {
                    this.milesTraveled += this.speed;
                    System.out.println("You have travelled " + this.milesTraveled + " miles");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            moving.start();
        }
        this.speed += this.acceleration;
    }

    public void brake() {
        this.speed -= 5;
        if(this.speed == 0){
            this.isMoving = false;
            System.out.println("You have travelled " + milesTraveled + " Miles Hooray");
        }
    }
}
