package org.example.day12.상속;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    public void display() {
        super.display();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}
