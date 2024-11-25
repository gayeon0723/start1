package org.example.day4.array;

import java.util.Random;
import java.util.Scanner;

public class 성적변동문제 {
    public static void main(String[] args) {
        //1. ppt p.48 성적변동문제
        //2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        //  숫자입력 : 55
        //  숫자입력 : 77
        //  숫자입력 : 11
        //  합계 : 143
        //  평균 : 47.666666667
        Scanner sc = new Scanner(System.in);
        int count = 3;
        int sum1 = 0;
        for(int i = 0; i < count; i++) {
            System.out.println("숫자입력 : ");
            int num = sc.nextInt();
            sum1 += num;
        }
        double average = (double) sum1 / count;

        System.out.println("합계 : " + sum1);
        System.out.println("평균 : " + average);

        sc.close();

        //3. int[] n = new int[1000];
        //random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
        int[] n = new int[1000];
        Random r = new Random(44);
        for(int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
        }
        System.out.println("배열의 값들 : ");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + " ");
        }
        System.out.println();
        //3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
        int sumSelected = n[0] + n[2] + n[4] + n[99] + n[989];
        System.out.println("첫번째, 세번째, 다섯번째값, 100번째값, 990번째값의 합 : " + sumSelected);
        //3-2. 전체 합계와 평균 출력

        //4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        //(단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
        //가고 싶은 곳(보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
        //당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.

        //5.random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555)
        //80보다 큰 수 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
    }
}
