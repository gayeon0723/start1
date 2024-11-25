package org.example.day20.알고리즘;

public class 양꼬치 {
    public static void main(String[] args) {
        int n = 10; //양꼬치 인분
        int k = 3; //음료수
        int answer = 0;
        int count = n / 10; //1

        answer = n * 12000 + k * 2000 - count * 2000;
        System.out.println(answer);
    }
}
