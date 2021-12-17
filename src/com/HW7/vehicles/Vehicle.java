package com.HW7.vehicles;

public class Vehicle {
    public String name;
    private int speed;
    private int power;


    public Vehicle(String name, int speed, int power) {
        this.name = name;
        this.speed = speed;
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
