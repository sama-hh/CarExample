package org.example;

//Step 1: Define the properties of a car, e.g. 'Brand', 'Model', 'Color', 'Year of Manufacture', etc.
//Step 2: Implement a method that "starts" the car and outputs a message.
//Step 3: Create an object of the class 'Car' and call the method to start it.
//Step 4: Extend the class 'Car' with a property 'Speed' and a method that "accelerates" the car and changes the speed.
//Step 5: Create a second object of the class 'Car', accelerate it, and display the speed.
public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    int speed;

    public Car(String brand, String model, String color, int yearOfManufacture, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public void start() {
        System.out.println("The car is started");
    }

    public void accelerate(int acceleration) {
        this.speed += acceleration;
    }

    public void accelerate() {
        this.accelerate(10);
    }
}
