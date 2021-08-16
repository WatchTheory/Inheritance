package com.Udemy;

public class Dog extends Animal {

    /*
    * Dog class inherits from Animal class
    * also known as the base class
    * Dog class inherits from the base class
    * */
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Constructors
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // Super = to call a Con, to the call we are extending from
        // in this case extending from Animal
        super(name,1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // Behaviors unique to a dog
    private void chew(){
        System.out.println(" 2.Dog.chew() called ");
    }


    /*
    * We can create a version of that same method
    * that exist in the Animal class,
    * but making it unique to the dog class
    *  */
    @Override
    public void eat() {
        System.out.println(" 1.Dog.eat() called");
        chew(); // called the private method chew()
        super.eat(); // called the animal.eat() class
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run) called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called ");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        super.move(speed);
    }
}
