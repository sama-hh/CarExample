package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Raw4", "red", 2015, 0);
        System.out.println(car.speed);

        Car carTwo = new Car("Porsche", "GT4", "red", 2015, 120);
        carTwo.accelerate(40);
        System.out.println(carTwo.speed);
    }
}