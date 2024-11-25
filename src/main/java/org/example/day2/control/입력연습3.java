package org.example.day2.control;

import java.util.Scanner;

public class 입력연습3 {
    public static void main(String[] args) {
        //수동 import ==> alt + 엔터
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 >> ");
        int age = sc.nextInt();
        System.out.print("키를 입력 >> ");
        double height = sc.nextDouble();
        System.out.println("몸무게를 입력 >> ");
        double weight = sc.nextDouble();
        System.out.print("저녁식사 여부 입력 >> ");
        Boolean food = sc.nextBoolean();
        System.out.print("좌우명 입력 >> ");
        sc.nextLine();
        String life = sc.nextLine();

    }
}
