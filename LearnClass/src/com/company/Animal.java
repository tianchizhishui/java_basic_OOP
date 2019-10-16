package com.company;

public class Animal {
    // this class defines what an animal is

    // class member/properties
    public String name;
    private int age;
    public boolean isHealthy;

    // methods
    public void jiao() {
        System.out.println(this.name + " make noise!");
    }

    public void eat() {
        System.out.println(this.name + " eat");
    }

    Animal() {
    };

    // constructor
    Animal(String inputName, int inputAge, boolean inputIsHealty) {
        this.name = inputName;
        this.age = inputAge;
        this.isHealthy = inputIsHealty;
    }

    public int getAge() {
        // getter
        return this.age;
    }
}
