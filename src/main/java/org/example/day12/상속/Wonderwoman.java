package org.example.day12.상속;

public class Wonderwoman extends Woman{
    int high; //점프 높게!

    public Wonderwoman(char gender, String name, int walk, int high) {
        super(gender, name, walk);
        this.high = high;
    }

    @Override
    public String toString() {
        return "Wonderwoman{" +
                "high=" + high +
                ", walk=" + walk +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
