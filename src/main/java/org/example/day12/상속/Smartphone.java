package org.example.day12.상속;

public class Smartphone extends Electronic {
    private int cameraResolution; // 카메라 해상도

    public Smartphone(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int resolution) {
        this.cameraResolution = resolution;
    }

    public void display() {
        super.display();
        System.out.println("cameraResolution=" + cameraResolution);
    }
}
