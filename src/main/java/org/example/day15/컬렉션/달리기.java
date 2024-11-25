package org.example.day15.컬렉션;

import java.util.LinkedList;

public class 달리기 {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        queue.add("박소정");
        queue.add("김경민");
        queue.add("소지현");
        queue.add("김개빈");
        System.out.println("초기 참가자 목록 : " + queue);
        queue.remove();
        System.out.println("탈락 후 참가자 목록 : " + queue);

        for (int i = 0; i < queue.size(); i++) {
            System.out.println((i + 1) + "등 : " + queue.get(i));
        }
    }
}
