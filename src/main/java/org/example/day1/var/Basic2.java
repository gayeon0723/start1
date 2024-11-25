package org.example.day1.var;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");
        // 기본형 4가지 : 정수, 실수, 문자, 논리
        int month = 9;
        double tempThis = 21.1; // 낙타표기법, package, class, var
        final char COLOR = 'b'; // final - 상수
        boolean isLeapYear = true;

        System.out.println("달은 " + month);
        System.out.println("온도는 " + tempThis);
        System.out.println("색은 " + COLOR);
        System.out.println("낙엽이 떨어지는 계절 " + isLeapYear);

        month = 10;
        // COLOR = 'r'; // 값 변경 금지

        int nowTime = 0; //초기화(초기값)
        nowTime = 17; // 변수는 반드시 초기화를 시켜주어야함.
        System.out.println(nowTime);
    }
}
