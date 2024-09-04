package org.example;

public class Person {
    String name;
    int age;
    String gender;
    String[] hobbies;
    public Person (String name, int age, String gender, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
    }
    public void introduction () {
        System.out.println("'Hello, I am " + this.name + " and I am " + this.age +  " years old.'");
    }

}
