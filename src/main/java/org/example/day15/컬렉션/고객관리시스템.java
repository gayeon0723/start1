package org.example.day15.컬렉션;

import java.util.HashMap;
import java.util.Set;

public class 고객관리시스템 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김구조");
        map.put(400, "김자료");
        Set keys = map.keySet();
        for (Object key : keys) {
            System.out.println("고객 번호: " + key + ", 이름: " + map.get(key));
        }
        System.out.println("--------------------");
        map.remove(200);
        for (Object key : keys) {
            System.out.println("고객 번호: " + key + ", 이름: " + map.get(key));
        }
        System.out.println("--------------------");
        map.put(300, "김충성");
        for (Object key : keys) {
            System.out.println("고객 번호: " + key + ", 이름: " + map.get(key));
        }
    }
}
