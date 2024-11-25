package org.example.day11.review;

public class 직원 {
    String name;
    int age;
    String gender;
    static int count;
    private static int sum;

    public 직원(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
        sum = sum + age;
    }
    public static double getAvg(){
        return sum / (double)count;
    }

    //@Override
    public String toString() {
        return "직원{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
