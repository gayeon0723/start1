package org.example.day12.상속;

public class Main {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Toyota", "Camry", 4);
        Bike bike = new Bike("Yamaha", "MT-15", true);

        car1.display();
        bike.display();
    }
}
