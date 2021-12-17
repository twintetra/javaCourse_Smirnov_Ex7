package com.HW7.vehicles;

public class Car extends Vehicle {

    private int wheels;

    public Car(int wheels, String name, int speed, int power) {
        super(name, speed, power);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }
}
