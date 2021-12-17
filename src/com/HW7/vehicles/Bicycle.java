package com.HW7.vehicles;

public class Bicycle extends Vehicle {

    public boolean tricks;
    private boolean bar;
    private int power;

    public Bicycle(boolean tricks, String name, int speed, int power) {
        super(name, speed, power);
        this.tricks = tricks;
        this.power = power;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }
}
