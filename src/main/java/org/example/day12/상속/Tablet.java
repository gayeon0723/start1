package org.example.day12.상속;

public class Tablet extends Electronic {
    private boolean isConnected; // 연결 상태

    public Tablet(int batteryCapacity, String color, boolean isConnected) {
        super(batteryCapacity, color);
        this.isConnected = isConnected;
    }

    public boolean getIsConnected() {
        return isConnected;
    }

    public void setIsConnected(boolean status) {
        this.isConnected = status;
    }

    public void display() {
        super.display();
        System.out.println("isConnected=" + isConnected);
    }
}
