package org.example.day15.컬렉션;

import java.util.ArrayList;

public class Cast3 {
    public static void main(String[] args) {
        //많은 양의 데이터를 다루는 부품류들 콜렉션
        // ==> 배열 + 사이즈조절 + 타입 아무거나 넣을 수 있는 ArrayList
        ArrayList list = new ArrayList(); //참조형변수
        list.add("자바");

        //list.add(new 사람());
        list.add(new ArrayList());

        String s = (String)list.get(0);

        list.add(100);

        int i = (Integer)list.get(3);
    }
}
