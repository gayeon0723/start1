package org.example.day5.array2;

public class 배열성적 {
    public static void main(String[] args) {
        String[] 과목명 = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] first = {44, 66, 22, 99, 100};
        int[] second = first.clone();
        second[0] = 22;
        second[2] = 88;

        // 0) 전체 1학기, 2학기 성적 프린트
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i] + " ");
        }
        System.out.println();

        // 1) 1학기, 2학기 성적 중 동일한 성적과목수
        int count = 0;
        for(int i = 0; i < first.length; i++){
            if(first[i] == second[i]) {
                count++;
            }
        }
        System.out.println("동일과목수: " + count + "개");

        // 2) 1학기, 2학기 성적 중 오른 과목수
        int count2 = 0;
        int index = 0;
        for (int i = 0; i < second.length; i++) {
            if (first[i] < second[i]) {
                count2++;
                index = i;
            }
        }
        System.out.println("동일과목수: " + count2 + "개");

        // 3) 1학기, 2학기 성적 중 오른 과목명
        if (count2 > 0) {
            System.out.println("오른과목명: " + 과목명[index]);
        }
    }
}
