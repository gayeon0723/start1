package org.example.day10.생성자;

public class Day {
    String doing;
    int time;
    String place;
    static int count;
    static int sum;


    public Day(String doing, int time, String place) {
        this.doing = doing;
        this.time = time;
        this.place = place;
        count++;
        sum = sum + time;
    }
    public static double getAvg(){
        return sum / (double)count;
    }
    public String getDoingTime(){
        return getDoing() + " " + time;
    }
    public String getDoing() {
        return doing;
    }

    public String toString() {
        return "Day{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", place='" + place + '\'' +
                '}';
    }
}
