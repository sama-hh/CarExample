package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Raw4", "red", 2015, 0);
        System.out.println(car.speed);
        car.accelerate(100);
        System.out.println(car.speed);
        car.accelerate();
        System.out.println(car.speed);
    }
}