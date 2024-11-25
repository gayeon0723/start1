package org.example.day20.알고리즘;

public class 나이출력 {
    public static void main(String[] args) {
        int age = 40;
        //int age = 23;
        Solution6 solution5 = new Solution6();
        int answer = solution5.solution(age);
        System.out.println(answer);
    }
}

class Solution6 {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }
}
