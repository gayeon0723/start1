package org.example.day20.알고리즘;

public class 숫자비교하기 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        //int num1 = 11;
        //int num2 = 11;
        //int num1 = 7;
        //int num2 = 99;
        Solution5 solution4 = new Solution5();
        int answer = solution4.solution(num1, num2);
        System.out.println(answer);
    }
}

class Solution5 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}
