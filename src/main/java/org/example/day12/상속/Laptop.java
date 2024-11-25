package org.example.day12.상속;

public class Laptop extends Electronic {
    public Laptop(int batteryCapacity, String color) {
        super(batteryCapacity, color);
    }

    public void charge(int additionalCapacity) {
        this.batteryCapacity += additionalCapacity;
    }

    public void display() {
        super.display();
    }
}
