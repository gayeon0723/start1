package org.example.day11.스태틱static;

public class Exercise {
    String doing;
    String who;
    int time;
    static int count;
    private static int sum;

    public Exercise(String doing, String who, int time) {
        this.doing = doing;
        this.who = who;
        this.time = time;
        count++;
        sum += time;
    }
    public static int getTime() {
        return sum;
    }

    //@Override
    public String toString() {
        return "Exercise{" +
                "doing='" + doing + '\'' +
                ", who='" + who + '\'' +
                ", time=" + time +
                '}';
    }
}
