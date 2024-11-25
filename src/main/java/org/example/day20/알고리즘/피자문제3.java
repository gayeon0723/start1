package org.example.day20.알고리즘;

public class 피자문제3 {
    public static void main(String[] args) {
        int answer = 0;
        int slice = 7;
        int n = 10;
        if (n <= slice) {
            answer = 1;
        } else if (n % slice == 0) {
            answer = n / slice;
        } else if (n % slice != 0) {
            answer = n / slice + 1;
        }
        System.out.println(answer);
    }
}
