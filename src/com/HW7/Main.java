package com.HW7;

import com.HW7.vehicles.*;

public class Main {

    public static void main(String[] args) {

        Vehicle unknownVehicle = new Vehicle("unknownVehicle",20, 5);
        System.out.println(unknownVehicle.name);
        printCarInfo();
        System.out.println("--------------");
        printBicycleInfo();
    }

    private static void printCarInfo() {
        Car someCar = new Car(4,"BMW X5", 200, 350);
        System.out.println(someCar.name + " на " + someCar.getWheels() + " колесах едет со скоростью " + someCar.getSpeed());
        System.out.println("Одно сломалось");
        someCar.setWheels(3);
        someCar.setSpeed(5);
        System.out.println(someCar.name + " на " + someCar.getWheels() + " колесах едет со скоростью " + someCar.getSpeed());
    }

    private static void printBicycleInfo() {
        Bicycle someBicycle  = new Bicycle(true, "BMX", 10, 1);
        System.out.println("Подходит для трюков? "  + someBicycle.name + (someBicycle.tricks ? " Да" : " Нет"));
        someBicycle.tricks = false;
        System.out.println("А теперь нет. Сломали прямым изменением в конструкции)");
        System.out.println("Подходит для трюков? "  + someBicycle.name + (someBicycle.tricks ? " Да" : " Нет"));
    }
}
