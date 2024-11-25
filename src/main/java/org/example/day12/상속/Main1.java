package org.example.day12.상속;

public class Main1 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(80, "red", 20);
        Tablet tablet = new Tablet(70, "blue", false);
        Laptop laptop = new Laptop(100, "silver");

        smartphone.display();
        tablet.display();
        laptop.display();
    }
}
