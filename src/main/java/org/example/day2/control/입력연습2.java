package org.example.day2.control;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {
        //수동 import ==> alt + 엔터
        Scanner sc = new Scanner(System.in);
        //정수 2개를 입력받아서 첫번째 숫자가 두번째 숫자보다 큰지 비교해서 출력
        System.out.print("첫번째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int second = sc.nextInt();

        System.out.println(first > second);
        sc.close();
    }
}
