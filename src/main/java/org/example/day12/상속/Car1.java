package org.example.day12.상속;

public class Car1 extends Vehicle {
    private int numDoors;

    public Car1(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void display() {
        super.display();
        System.out.println("Number of doors: " + numDoors);
    }
}
