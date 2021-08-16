package com.Udemy;

public class Animal {

    // Base Class
    // Fields = characterise
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // Behaviors of Animals
    // Functions
    public void eat(){
        System.out.println(" 3.Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called " + speed);

    }

    // Constructors
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
