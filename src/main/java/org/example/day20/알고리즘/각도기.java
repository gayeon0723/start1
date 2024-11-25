package org.example.day20.알고리즘;

public class 각도기 {
    public static void main(String[] args) {
        int angle = 70;
        //int angle = 91;
        //int angle = 180;
        Solution7 solution6 = new Solution7();
        int answer = solution6.solution(angle);
        System.out.println(answer);
    }
}

class Solution7 {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
