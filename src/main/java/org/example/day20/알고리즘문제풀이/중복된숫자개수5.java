package org.example.day20.알고리즘문제풀이;

public class 중복된숫자개수5 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int answer = 0; //1이 몇개인지 카운트
        for (int x : array) {
            if (x == n){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
