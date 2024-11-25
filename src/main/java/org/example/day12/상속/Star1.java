package org.example.day12.상속;

public class Star1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println(i);
        }
    }
}
