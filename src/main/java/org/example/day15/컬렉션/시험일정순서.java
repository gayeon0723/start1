package org.example.day15.컬렉션;

import java.util.LinkedList;

public class 시험일정순서 {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        queue.add("국어");
        queue.add("수학");
        queue.add("영어");
        queue.add("컴퓨터");
        System.out.println("처음 시험별 과목: " + queue);
        queue.remove();
        System.out.println("1회차 시험을 한 날 과목: " + queue);
        queue.remove();
        System.out.println("2회차 시험을 한 날 과목: " + queue);
        queue.remove();
        System.out.println("3회차 시험을 한 날 과목: " + queue);
    }
}
