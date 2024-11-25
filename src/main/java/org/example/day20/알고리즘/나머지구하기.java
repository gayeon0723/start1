package org.example.day20.알고리즘;

public class 나머지구하기 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        //int num1 = 10;
        //int num2 = 5;
        Solution4 solution3 = new Solution4();
        int answer = solution3.solution(num1, num2);
        System.out.println(answer);
    }
}

class Solution4 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
}
