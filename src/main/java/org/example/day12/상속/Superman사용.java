package org.example.day12.상속;

public class Superman사용 {
    public static void main(String[] args) {
        Superman s = new Superman('m', "Clark", 100);
        //s.gender = 'm';
        //s.name = "Clark";
        //s.power = 100;

        System.out.println(s);

        s.sleep();
        s.eat();
        s.run();
        s.fly();
    }
}
