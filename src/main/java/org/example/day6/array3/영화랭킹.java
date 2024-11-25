package org.example.day6.array3;

import java.util.Scanner;

public class 영화랭킹 {
    public static void main(String[] args) {
        String[] title = {"Quiet Place", "Avengers: Endgame", "Inception", "Parasite", "Interstellar"};
        int[] view = {15000, 23000, 18000, 21000, 19000};
        for (int i = 0; i < title.length; i++) {
            System.out.println((i+1) + "." + title[i] + " - 조회수: " + view[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요. (0~4)");

        int index = sc.nextInt();

        if (index >= 0 && index < title.length) {
            // 선택한 영화의 제목과 조회수 출력
            System.out.println("선택한 영화: " + title[index]);
            System.out.println("조회수: " + view[index] + "회");
        }
        sc.close();
    }
}
