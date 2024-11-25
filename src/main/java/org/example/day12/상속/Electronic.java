package org.example.day12.상속;

public class Electronic {
    protected int batteryCapacity; // 배터리 용량
    private String color; // 색상

    public Electronic(int batteryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("batteryCapacity=" + batteryCapacity);
        System.out.println("color=" + color);
    }
}
