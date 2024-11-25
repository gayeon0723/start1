package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        // 기본형 변수를 정리  - 정수, 실수, 문자1, 논리
        float temp = 23.5f; // ==> double
        byte date = 26; // byte : -128 ~ 127까지 들어갈 수 있음 ==> int
        final char DAY = '목';
        boolean food = true;

        String roomNo = "강의장 6호";

        System.out.println("온도: " + temp);  // 실수형 출력
        System.out.println("날짜: " + date);  // byte형 출력
        System.out.println("요일: " + DAY);   // 문자형 출력
        System.out.println("식사 여부: " + food); // 논리형 출력
        System.out.println("강의실 번호: " + roomNo);  // 문자열 출력
    }
}
