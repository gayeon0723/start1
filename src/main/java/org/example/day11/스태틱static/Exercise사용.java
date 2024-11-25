package org.example.day11.스태틱static;

public class Exercise사용 {
    public static void main(String[] args) {
        Exercise w1 = new Exercise("테니스", "친구", 3);
        System.out.println(w1);

        Exercise w2 = new Exercise("러닝", "동네모임", 2);
        System.out.println(w2);

        System.out.println(Exercise.count);
        System.out.println(Exercise.getTime());
    }
}
