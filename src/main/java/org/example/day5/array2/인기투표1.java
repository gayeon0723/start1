package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표1 {
    public static void main(String[] args) {
        String[] name = {"아이유", "유재석", "방탄"};

        int[] tv = new int[3];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("인기투표 1)아이유, 2)유재석, 3)방탄, 4)종료");
            System.out.println("선택번호>> ");
            int num = sc.nextInt();

            if (num == 4) {
                System.out.println("아이유 : " + tv[0]);
                System.out.println("유재석 : " + tv[1]);
                System.out.println("방탄 : " + tv[2]);
                System.out.println("총 투표수 : " + (tv[0] + tv[1] + tv[2]));
                break;
            }
        }
    }
}
